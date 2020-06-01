import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cco15p4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		char[][] array = new char[nextInt()][nextInt()];

		for (int i = 0; i < array.length; i++) {
			array[i] = br.readLine().toCharArray();
		}
		boolean[][] visited = new boolean[array.length][array[0].length];
		for (int i = array.length-1; i >= 0; i--) {
			for (int j = array[i].length-1; j >= 0; j--) {
				if (array[i][j] != '.' && !visited[i][j]) {
					visited[i][j] = true;
					dfs(visited, array, i, j);
				}
			}
		}
	}

	static void dfs(boolean[][] visited, char[][] array, int x, int y) {
		int modX = 0;
		int modY = 0;
		if (array[x][y] == 'N') {
			modX = -1;
		} else if (array[x][y] == 'S') {
			modX = 1;
		} else if (array[x][y] == 'W') {
			modY = -1;
		} else {
			modY = 1;
		}

		if (modX != 0) {
			for (int i = x; i >= 0 && i < array.length; i += modX) {
				if (!visited[i][y]) {
					visited[i][y] = true;
					if (array[i][y] != '.') {
						dfs(visited, array, i, y);
					}
				}
			}
		} else {
			for (int i = y; i >= 0 && i < array[0].length; i += modY) {
				if (!visited[x][i]) {
					visited[x][i] = true;
					if (array[x][i] != '.') {
						dfs(visited, array, x, i);
					}
				}
			}
		}
		System.out.println("(" + x + "," + y + ")");
	}
}