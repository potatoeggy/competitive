import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class dmopc16c4p5 {
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

		int[] distance = new int[adj.length];
		boolean[] visited = new boolean[adj.length];
		Queue<Node> pq = new LinkedList<Node>();

		visited[1] = true;
		distance[1] = Integer.MAX_VALUE;
		pq.add(new Node(1, Integer.MAX_VALUE));

		while (!pq.isEmpty()) {
			Node node = pq.poll();
			for (Node n : adj[node.vertex]) {
				if (Math.min(distance[node.vertex], n.weight) > distance[n.vertex]) {
					distance[n.vertex] = Math.min(distance[node.vertex], n.weight);
					pq.add(new Node(n.vertex, distance[n.vertex]));
				}
			}
		}

		distance[1] = 0;
		for (int i = 1; i < adj.length; i++) {
			System.out.println(distance[i]);
		}
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