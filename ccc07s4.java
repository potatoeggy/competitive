import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ccc07s4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int dest = nextInt();
		ArrayList<Integer>[] adj = new ArrayList[dest+1];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Integer>();
		}

		int x = nextInt();
		int y = nextInt();

		while (x != 0) {
			adj[y].add(x);
			x = nextInt();
			y = nextInt();
		}

		int[] pathsToGetHere = new int[adj.length];
		pathsToGetHere[dest] = 1;
		// maybe just don't actually search through at all
		for (int i = dest; i >= 0; i--) {
			for (int j : adj[i]) {
				pathsToGetHere[j] += pathsToGetHere[i];
			}
		}
		System.out.println(pathsToGetHere[1]);
	}
}