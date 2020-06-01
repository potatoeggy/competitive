import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class vmss15c1p4 {
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
		int[] food = new int[nextInt()];
		for (int i = 0; i < food.length; i++) {
			food[i] = nextInt();
		}

		for (int i = 0; i < times; i++) {
			adj[nextInt()].add(new Edge(nextInt(), nextInt()));
		}

		int[] distance = new int[adj.length];
		boolean[] vis = new boolean[adj.length];
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();

		vis[0] = true;
		pq.add(new Edge(0, 0));

		while (!pq.isEmpty()) {
			Edge edge = pq.poll();

			if (edge.w > distance[edge.v] || edge.w > limit) continue; // that second part probably isn't going to work

			for (Edge e : adj[edge.v]) {
				if (!vis[e.v]) {
					distance[e.v] = distance[edge.v] + e.w;
					vis[e.v] = true;
					pq.add(new Edge(e.v, distance[e.v]));
				} else if (distance[e.v] > distance[edge.v] + e.w) {
					distance[e.v] = edge.w + e.w;
					pq.add(new Edge(e.v, distance[e.v]));
				}
			}
		}

		int c = 0;
		for (int i = 0; i < food.length; i++) {
			if (distance[food[i]] < limit && vis[food[i]]) c++;
		}
		System.out.println(c);
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