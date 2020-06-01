import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class dmopc14ce1p4 {
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

		for (int i = 0; i < times; i++) {
			int x = nextInt();
			int y = nextInt();
			int d = nextInt();
			double kph = nextInt();
			double origw = d / kph * 60;
			double w = d / (kph * 0.75) * 60;
			adj[x].add(new Edge(y, w, origw));
			adj[y].add(new Edge(x, w, origw));
		}

		int[] dis = new int[adj.length];
		double[] time = new double[adj.length];
		double[] origtime = new double[adj.length];
		boolean[] vis = new boolean[adj.length];
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		vis[1] = true;
		pq.add(new Edge(1, 0, 0));

		while (!pq.isEmpty()) {
			Edge edge = pq.poll();
			if (edge.w > time[edge.v]) continue;
			for (Edge e : adj[edge.v]) {
				if (!vis[e.v]) {
					vis[e.v] = true;
					dis[e.v] = dis[edge.v] + 1;
					time[e.v] = time[edge.v] + e.w;
					origtime[e.v] = origtime[edge.v] + e.origw;
					pq.add(new Edge(e.v, time[e.v], origtime[e.v]));
				} else if (time[e.v] > time[edge.v] + e.w) {
					dis[e.v] = dis[edge.v] + 1;
					time[e.v] = time[edge.v] + e.w;
					origtime[e.v] = origtime[edge.v] + e.origw;
					pq.add(new Edge(e.v, time[e.v], origtime[e.v]));
				}
			}
		}
		System.out.println(dis[adj.length-1]);
		System.out.println(Math.abs((int)(Math.round(origtime[adj.length-1] - time[adj.length-1]))));
	}

	static class Edge implements Comparable<Edge> {
		int v;
		double origw, w;

		Edge(int v, double w, double origw) {
			this.v = v;
			this.w = w;
			this.origw = origw;
		}

		public int compareTo(Edge e) {
			return Double.compare(w, e.w);
		}
	}
}