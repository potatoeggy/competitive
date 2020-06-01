import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class dmopc14c2p5 {
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
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Integer>();
		}

		int rivers = nextInt();

		for (int i = 0; i < rivers; i++) {
			adj[nextInt()].add(nextInt());
		}

		LinkedList<Integer> q = new LinkedList<Integer>();
		double[] paths = new double[adj.length];
		boolean[] vis = new boolean[adj.length];
		vis[1] = true;
		paths[1] = 1;
		q.add(1);

		while (!q.isEmpty()) {
			int x = q.poll();
			for (int i : adj[x]) {
				paths[i] += paths[x] / adj[x].size();
				q.add(i);
			}
		}

		for (int i = 1; i < adj.length; i++) {
			if (adj[i].size() == 0) System.out.println(paths[i]);
		}
	}
}