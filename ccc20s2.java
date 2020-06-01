import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class ccc20s2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int rows = nextInt() + 1;
		int columns = nextInt() + 1;

		ArrayList<Pair>[] adj = new ArrayList[1000001];

		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Pair>();
		}

		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < columns; j++) {
				adj[nextInt()].add(new Pair(i, j));
			}
		}

		LinkedList<Pair> q = new LinkedList<Pair>();
		boolean[][] vis = new boolean[rows][columns];
		vis[rows-1][columns-1] = true;
		q.add(new Pair(rows-1, columns-1));

		boolean found = false;
		while (!q.isEmpty()) {
			Pair pair = q.poll();
			for (Pair p : adj[pair.x * pair.y]) {
				if (!vis[p.x][p.y]) {
					vis[p.x][p.y] = true;
					q.add(p);
					if (p.x == 1 && p.y == 1) {
						found = true;
						break;
					}
				}
			}
			if (found) break;
		}

		System.out.println(vis[1][1] ? "yes" : "no");
	}

	static class Pair {
		int x, y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}