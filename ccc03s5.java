import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ccc03s5 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}

		return Integer.parseInt(st.nextToken());
	}
	public static void main(String[] args) throws IOException {
		ArrayList<Node>[] adj = new ArrayList[nextInt()+1];
		int queries = nextInt();
		int[] dests = new int[nextInt()];

		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Node>();
		}

		for (int i = 0; i < queries; i++) {
			int x = nextInt();
			int y = nextInt();
			int z = nextInt();

			adj[x].add(new Node(y, z));
			adj[y].add(new Node(x, z));
		}

		for (int i = 0; i < dests.length; i++) {
			dests[i] = nextInt();
		}

		int[] distance = new int[adj.length];
		boolean[] visited = new boolean[adj.length];
		Queue<Node> pq = new LinkedList<Node>();

		visited[1] = true;
		distance[1] = Integer.MAX_VALUE;
		pq.add(new Node(1, Integer.MAX_VALUE));

		while (!pq.isEmpty()) {
			Node node = pq.poll();
			for (Node n : adj[node.vertex]) {
				if (distance[n.vertex] >= node.weight) {
					continue;
				}
				if (!visited[n.vertex]) {
					distance[n.vertex] = Math.min(n.weight, distance[node.vertex]);
					visited[n.vertex] = true;
					pq.add(new Node(n.vertex, distance[n.vertex]));
				} else if (distance[n.vertex] <= n.weight) {
					distance[n.vertex] = n.weight;
					pq.add(new Node(n.vertex, distance[n.vertex]));
				}
			}
		}
		// priority queue?
		int min = Integer.MAX_VALUE;
		for (int i : dests) {
			if (min > distance[i]) {
				min = distance[i];
			}
		}
		System.out.println(min);
	}

	static class Node implements Comparable<Node> {
		int vertex, weight;

		public Node (int vertex, int weight) {
			this.vertex = vertex;
			this.weight = weight;
		}

		public int compareTo(Node node) {
			return Integer.compare(weight, node.weight);
		}
	}
}