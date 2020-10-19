import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class thicc17p6 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine());
		}
		return Integer.parseInt(st.nextToken());
	}
	public static void main(String[] args) throws IOException {
		int tunnels = nextInt(), location = nextInt();
		ArrayList<Edge>[] adj = new ArrayList[tunnels];
		boolean[] dis = new boolean[adj.length];

		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Edge>();
		}

		for (int i = 0; i < tunnels-1; i++) {
			adj[nextInt()].add(new Edge(nextInt(), nextInt())); // are these bidirectional
			// also is this dp again
			// this is dp again
		}
	}

	static class Edge implements Comparable<Edge> {
		int end, cost;
		public Edge(int end, int cost) {
			this.end = end;
			this.cost = cost;
		}

		public int compareTo(Edge other) {
			return Integer.compare(this.cost, other.cost);
		}
	}
}