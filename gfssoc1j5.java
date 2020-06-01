import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class gfssoc1j5 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		ArrayList<Integer>[] adj = new ArrayList[nextInt()+1];

		int times = nextInt();
		int minutes = nextInt();

		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		
		for (int i = 0; i < times; i++) {
			adj[nextInt()].add(nextInt());
		}

		int queries = nextInt();

		for (int i = 0; i < queries; i++) {
			int start = nextInt();
			int end = nextInt();
			bfs(adj, start, end, minutes);
		}
	}

	static void bfs(ArrayList<Integer>[] adj, int start, int end, int minutes) {
		Queue<Integer> q = new LinkedList<Integer>();
		boolean[] visited = new boolean[adj.length];
		int[] distance = new int[adj.length];

		visited[start] = true;
		q.add(start);

		boolean found = false;
		while (!q.isEmpty()) {
			int x = q.poll();

			for (int i : adj[x]) {
				if (!visited[i]) {
					visited[i] = true;
					distance[i] = distance[x] + 1;
					if (i == end) {
						found = true;
						break;
					}
					q.add(i);
				}
			}

			if (found) {
				break;
			}
		}
		System.out.println(found ? distance[end] * minutes : "Not enough hallways!");
	}
}