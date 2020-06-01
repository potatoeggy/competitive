import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class ccc15s4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int limit = nextInt();
		ArrayList<Edge>[] adj = new ArrayList[nextInt()+1];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Edge>();
		}
		int times = nextInt();

		for (int i = 0; i < times; i++) {
			int x = nextInt();
			int y = nextInt();
			int w = nextInt();
			int h = nextInt();
			adj[x].add(new Edge(y, w, h));
			adj[y].add(new Edge(x, w, h));
		}

		int start = nextInt();
		int dest = nextInt();

		int[][] dis = new int[limit][adj.length];
		boolean[] vis = new boolean[adj.length];
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		vis[start] = true;
		pq.add(new Edge(start, 0, 0));

		while (!pq.isEmpty()) {
			Edge edge = pq.poll();
			if (edge.w > dis[edge.h][edge.v]) continue;

			for (Edge e : adj[edge.v]) {
				if (edge.h + e.h < limit) {
					if (!vis[e.v]) {
						vis[e.v] = true;
						dis[edge.h+e.h][e.v] = dis[edge.h][edge.v] + e.w;
						pq.add(new Edge(e.v, dis[edge.h+e.h][e.v], edge.h + e.h));
					} else if (dis[edge.h+e.h][e.v] > dis[edge.h][edge.v] + e.w) {
						dis[edge.h+e.h][e.v] = dis[edge.h][edge.v] + e.w;
						pq.add(new Edge(e.v, dis[edge.h+e.h][e.v], edge.h + e.h));
					} // i don't know what's happening
				}
			}
		}

		for (int i = 0; i < dis.length; i++) {
			for (int j = 0; j < dis[i].length; j++) {
				System.out.print(dis[i][j] + " ");
			}
			System.out.println();
		}
		if (vis[dest]) {
			int max = 0;
			for (int i = 1; i < dis.length; i++) {
				max = Math.max(dis[i][dest], max); // this shouldn't even *be* max
			}
			System.out.println(max);
		} else {
			System.out.println(-1);
		}
	}

	static class Edge implements Comparable<Edge> {
		int v, w, h;
		Edge(int v, int w, int h) {
			this.v = v;
			this.w = w;
			this.h = h;
		}

		public int compareTo(Edge e) {
			return Integer.compare(w, e.w);
		}
	}
}