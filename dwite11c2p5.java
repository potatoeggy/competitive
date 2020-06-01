import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class dwite11c2p5 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public static void main(String[] args) throws IOException {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int times = nextInt(); // loop this part too
		ArrayList<Integer>[] adj = new ArrayList[times];

		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Integer>();
		}

		int filled = 0;
		for (int i = 0; i < times; i++) { // loop 5 times
			String temp = next();
			String temp2 = next();

			if (!map.containsKey(temp)) { // try treemap if fails
				map.put(temp, filled);
				filled++;
			}

			if (!map.containsKey(temp2)) {
				map.put(temp2, filled);
				filled++;
			}
			adj[map.get(temp)].add(map.get(temp2));
			adj[map.get(temp2)].add(map.get(temp));
		}

		int queries = nextInt();

		for (int i = 0; i < queries; i++) {
			int start = map.get(next());
			int end = map.get(next());
			if (bfs()) // do diff data sets share graph?
		}
	}

	static boolean bfs(ArrayList[] adj, boolean)
}