import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class sssp {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}
	
	public static void main(String[] args) throws IOException {
		ArrayList<Node>[] adj = new ArrayList[nextInt()+1];
		int times = nextInt();

		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Node>();
		}

		for (int i = 0; i < times; i++) {
			int temp = nextInt();
			int tempVertex = nextInt();
			int tempWeight = nextInt();
			adj[temp].add(new Node(tempVertex, tempWeight));
			adj[tempVertex].add(new Node(temp, tempWeight));
		}

		boolean[] visited = new boolean[adj.length];
		int[] distance = new int[adj.length];
		Queue<Integer> q = new LinkedList<Integer>();

		visited[1] = true;
		q.add(1);

		while (!q.isEmpty()) {
			int x = q.poll();
			for (Node node : adj[x]) {
				if (!visited[node.vertex]) {
					distance[node.vertex] = distance[x] + node.weight;
					visited[node.vertex] = true;
					q.add(node.vertex);
				} else if (distance[x] + node.weight < distance[node.vertex]) {
					distance[node.vertex] = distance[x] + node.weight;
					q.add(node.vertex);
				}
			}
		}

		for (int i = 1; i < distance.length; i++) {
			if (i != 1 && distance[i] == 0) {
				System.out.println(-1);
			} else {
				System.out.println(distance[i]);
			}
		}
	}

	static class Node {
		int vertex;
		int weight;
		Node(int vertex, int weight) {
			this.vertex = vertex;
			this.weight = weight;
		}
	}
}