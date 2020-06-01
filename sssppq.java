import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class sssppq {
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
			int start = nextInt();
			int end = nextInt();
			int weight = nextInt();
			adj[start].add(new Edge(end, weight));
			adj[end].add(new Edge(start, weight));
		}

		int[] distance = new int[adj.length];
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[1] = 0;
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		
		pq.add(new Edge(1, 0));
		while (!pq.isEmpty()) {
			Edge edge = pq.poll();

			if (edge.weight > distance[edge.end]) {
				continue;
			}

			for (Edge e : adj[edge.end]) {
				if (distance[e.end] > distance[edge.end] + e.weight) {
					distance[e.end] = distance[edge.end] + e.weight;
					pq.add(new Edge(e.end, distance[e.end]));
				}
			}
		}

		for (int i = 1; i < distance.length; i++) {
			System.out.println(distance[i] != Integer.MAX_VALUE ? distance[i] : -1);
		}
	}

	static class Edge implements Comparable<Edge> {
		int end;
		int weight;

		Edge(int end, int weight) {
			this.end = end;
			this.weight = weight;
		}

		public int compareTo(Edge otherEdge) {
			return Integer.compare(weight, otherEdge.weight);
		}
	}
}