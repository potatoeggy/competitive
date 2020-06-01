import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dmopc13c3p3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int size = nextInt();
		int height = nextInt();
		int[][] array = new int[size][size];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = nextInt();
			}
		}

		boolean[][] visited = new boolean[array.length][array[0].length];
		visited[0][0] = true;
		dfs(0, 0, visited, array, height);

		System.out.println(visited[array.length-1][array[0].length-1] ? "yes" : "no");
	}

	static void dfs(int x, int y, boolean[][] visited, int[][] array, int height) {
		for (int i = -1; i <= 1; i += 2) {
			if (x+i >= 0 && x+i < array.length && !visited[x+i][y]) {
				visited[x+i][y] = true;
				if (Math.abs(array[x+i][y] - array[x][y]) <= height) {
					dfs(x+i, y, visited, array, height);
				}
			}

			if (y+i >= 0 && y+i < array.length && !visited[x][y+i]) {
				visited[x][y+i] = true;
				if (Math.abs(array[x][y+i] - array[x][y]) <= height) {
					dfs(x, y+i, visited, array, height);
				}
			}
		}
	}
}
