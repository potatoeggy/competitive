import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ccc09s4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int size = nextInt() + 1;
		int[][] adj = new int[size][size];
		int times = nextInt();

		for (int i = 0; i < times; i++) {
			int start = nextInt();
			int end = nextInt();
			int weight = nextInt();

			adj[start][end] = weight;
			adj[end][start] = weight;
		}

		int[] cities = new int[nextInt()];
		int[] prices = new int[cities.length];
		for (int i = 0; i < cities.length; i++) {
			cities[i] = nextInt();
			prices[i] = nextInt();
		}

		int start = nextInt();

		System.out.println(yikestra(adj, cities, prices, start));
	}

	static int yikestra(int[][] adj, int[] cities, int[] prices, int start) {
		int[] distance = new int[adj.length];
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[start] = 0;
		boolean[] visited = new boolean[adj.length];

		for (int i = 0; i < adj.length-1; i++) { // dijkstra through everything interesting
			int shortest = Integer.MAX_VALUE;
			int shortestCity = 0;
			for (int j = 1; j < adj.length; j++) { // picks unvisited small node
				if (!visited[j] && distance[j] < shortest) {
					shortest = distance[j];
					shortestCity = j;
				}
			}

			// start dijkstraing from city only one layer it seems
			visited[shortestCity] = true;
			for (int j = 1; j < adj.length; j++) {
				if (adj[shortestCity][j] > 0 && !visited[j] && distance[j] > distance[shortestCity] + adj[shortestCity][j]) {
					distance[j] = distance[shortestCity] + adj[shortestCity][j];
				}
			}
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < cities.length; i++) {
			int total = distance[cities[i]] + prices[i];
			if (total < min) {
				min = total;
			}
		}
		return min;
	}
}