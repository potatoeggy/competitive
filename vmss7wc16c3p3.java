import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class vmss7wc16c3p3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		ArrayList<Edge>[] adj = new ArrayList[nextInt()+1];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Edge>();
		}
		int times = nextInt();
		int start = nextInt();
		int queries = nextInt();

		for (int i = 0; i < times; i++) {
			int x = nextInt();
			int y = nextInt();
			int w = nextInt();
			adj[x].add(new Edge(y, w));
			adj[y].add(new Edge(x, w));
		}

		int[] dis = new int[adj.length];
		boolean[] vis = new boolean[adj.length];
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		vis[start] = true;
		pq.add(new Edge(start, 0));

		while (!pq.isEmpty()) {
			Edge edge = pq.poll();
			if (edge.w > dis[edge.v]) continue;

			for (Edge e : adj[edge.v]) {
				if (!vis[e.v]) {
					vis[e.v] = true;
					dis[e.v] = dis[edge.v] + e.w;
					pq.add(new Edge(e.v, dis[e.v]));
				} else if (dis[e.v] > dis[edge.v] + e.w) {
					dis[e.v] = dis[edge.v] + e.w;
					pq.add(new Edge(e.v, dis[e.v]));
				}
			}
		}

		for (int i = 0; i < queries; i++) {
			int dest = nextInt();
			System.out.println(vis[dest] ? dis[dest] : -1);
		}
	}

	static class Edge implements Comparable<Edge> {
		int v, w;
		Edge(int v, int w) {
			this.v = v;
			this.w = w;
		}
		public int compareTo(Edge e) {
			return Integer.compare(w, e.w);
		}
	}
}