import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class nccc5j5s3 {
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
		int[] tx = new int[times];
		int[] ty = new int[times];

		for (int i = 0; i < times; i++) {
			tx[i] = nextInt();
			ty[i] = nextInt();
			adj[tx[i]].add(ty[i]);
		}

		for (int i = 0; i < times; i++) {
			System.out.println(bfs(adj, tx[i], ty[i]) ? "YES" : "NO");
		}
	}

	static boolean bfs(ArrayList<Integer>[] adj, int omitX, int omitY) {
		boolean[] vis = new boolean[adj.length];
		LinkedList<Integer> q = new LinkedList<Integer>();
		
		vis[1] = true;
		q.add(1);

		while (!q.isEmpty()) {
			int x = q.poll();
			for (int y : adj[x]) {
				if (!vis[y]) {
					if (!(x == omitX && y == omitY)) {
						vis[y] = true;
						q.add(y);
					}
				}
			}
		}
		return vis[adj.length-1];
	}
}