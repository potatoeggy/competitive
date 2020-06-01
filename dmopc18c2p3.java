import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class dmopc18c2p3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		ArrayList<Integer>[] adj = new ArrayList[nextInt()+1];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		int roads = nextInt();
		int[] buildings = new int[nextInt()];
		int a = nextInt();
		int b = nextInt();

		for (int i = 0; i < buildings.length; i++) {
			buildings[i] = nextInt();
		}

		for (int i = 0; i < roads; i++) {
			int start = nextInt();
			int end = nextInt();
			adj[start].add(end);
			adj[end].add(start);
		}

		int[] aDis = bfs(adj, a);
		int[] bDis = bfs(adj, b);

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < buildings.length; i++) {
			if (aDis[buildings[i]] + bDis[buildings[i]] < min) {
				min = aDis[buildings[i]] + bDis[buildings[i]];
			}
		}
		System.out.println(min);
	}

	static int[] bfs(ArrayList<Integer>[] adj, int start) {
		int[] dis = new int[adj.length];
		boolean[] vis = new boolean[adj.length];
		LinkedList<Integer> q = new LinkedList<Integer>();
		
		vis[start] = true;
		q.add(start);

		while (!q.isEmpty()) {
			int x = q.poll();

			for (int i : adj[x]) {
				if (!vis[i]) {
					vis[i] = true;
					dis[i] = dis[x] + 1;
					q.add(i);
				}
			}
		}
		return dis;
	}
}
