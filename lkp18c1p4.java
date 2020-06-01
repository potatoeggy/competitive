import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class lkp18c1p4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	static long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	public static void main(String[] args) throws IOException {
		// assuming trains are labeled 1-N
		ArrayList<Edge>[] adj = new ArrayList[nextInt()+1];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Edge>();
		}
		int times = nextInt();

		for (int i = 1; i <= times; i++) {
			int x = nextInt();
			int y = nextInt();
			int w = nextInt();
			adj[x].add(new Edge(y, w, i));
			adj[y].add(new Edge(x, w, i));
		}

		int start = nextInt();
		int end = nextInt();
		long limit = nextLong();

		boolean[] vis = new boolean[adj.length];
		int[] distance = new int[adj.length];
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();

		vis[start] = true;
		pq.add(new Edge(start, 0, 0));

		while (!pq.isEmpty()) {
			Edge edge = pq.poll();
			if (edge.w > limit || edge.level > distance[edge.v]) continue;

			for (Edge e : adj[edge.v]) {
				if (!vis[e.v]) {
					vis[e.v] = true;
					distance[e.v] = Math.max(e.level, distance[edge.v]);
					pq.add(new Edge(e.v, e.w + edge.w, distance[e.v]));
				} else if (distance[e.v] > Math.max(distance[edge.v], e.level)) {
					distance[e.v] = Math.max(e.level, distance[edge.v]);
					pq.add(new Edge(e.v, e.w + edge.w, distance[e.v]));
				}
			}
		}
		System.out.println(vis[end] ? distance[end] : -1);

	}

	static class Edge implements Comparable<Edge> {
		int v, level;
		long w;
		Edge(int v, long w, int level) {
			this.v = v;
			this.w = w;
			this.level = level;
		}
		
		public int compareTo(Edge e) {
			return Integer.compare(level, e.level);
		}
	}
}