import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class globexcup18j5 {
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
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		int times = nextInt();
		int queries = nextInt();
		int start = nextInt();

		for (int i = 0; i < times; i++) {
			int x = nextInt();
			int y = nextInt();
			adj[x].add(y);
			adj[y].add(x);
		}

		int[] dis = new int[adj.length];
		boolean[] vis = new boolean[adj.length];
		LinkedList<Integer> pq = new LinkedList<Integer>();
		vis[start] = true;
		pq.add(start);

		while (!pq.isEmpty()) {
			int num = pq.poll();

			for (int i : adj[num]) {
				if (!vis[i]) {
					vis[i] = true;
					dis[i] = dis[num] + 1;
					pq.add(i);
				} else if (dis[i] > dis[num] + 1) {
					dis[i] = dis[num] + 1;
					pq.add(i);
				}
			}
		}

		for (int i = 0; i < queries; i++) {
			int a = nextInt();
			int b = nextInt();

			System.out.println(vis[a] && vis[b] ? dis[a] + dis[b] : "This is a scam!");
		}
	}
}