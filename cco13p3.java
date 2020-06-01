import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class cco13p3 {
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
		for (int i = 0; i < adj.length-2; i++) {
			int x = nextInt();
			int y = nextInt();
			adj[x].add(y);
			adj[y].add(x);
		}
		ArrayList<Integer> topSort = new ArrayList<Integer>();
		boolean[] vis = new boolean[adj.length];
		for (int i = 0; i < adj.length; i++) {
			if (!vis[i]) {
				vis[i] = true;
				dfs(adj, topSort, vis, i);
				topSort.add(i);
			}
		}

		for (int i = topSort.size()-1; i > 0; i--) {
			if (adj[topSort.get(i)].size() == 0) {
				System.out.println(i);
				break;
			}
		}
	}

	static void dfs(ArrayList<Integer>[] adj, ArrayList<Integer> topSort, boolean[] vis, int pos) {
		for (int i : adj[pos]) {
			if (!vis[i]) {
				vis[i] = true;
				dfs(adj, topSort, vis, i);
				topSort.add(i);
			}
		}
	}
}