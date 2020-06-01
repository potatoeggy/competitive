import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class vmss7wc15c6p3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		ArrayList<Integer>[] adj = new ArrayList[nextInt()+1];
		for (int i = 1; i < adj.length; i++) {
			adj[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < adj.length-2; i++) {
			adj[nextInt()].add(nextInt());
		}

		int[] base = new int[adj.length];
		for (int i = 1; i < base.length; i++) {
			base[i] = nextInt();
		}

		int[] agri = new int[adj.length];
		Arrays.fill(agri, -1001);
		for (int i = 1; i < adj.length; i++) {
			agri[i] = dfs(adj, base, agri, i);
		}

		int max = -1001;
		for (int i = 1; i < agri.length; i++) {
			if (agri[i] > max) {
				max = agri[i];
			}
		}
		System.out.println(max);
	}

	static int dfs(ArrayList<Integer>[] adj, int[] base, int[] agri, int start) {
		if (agri[start] != -1001) return agri[start];
		int total = base[start];
		for (int i : adj[start]) {
			int temp = dfs(adj, base, agri, i);
			total += temp;
			agri[i] = temp;
		}
		agri[start] = total;
		return total;
	}
}