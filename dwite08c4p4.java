import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class dwite08c4p4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int whatever = 0; whatever < 5; whatever++) {
			char[][] array = new char[8][8];
			int startX = -1;
			int startY = -1;
			for (int i = 0; i < array.length; i++) {
				array[i] = br.readLine().toCharArray();
				if (startX == -1) {
					for (int j = 0; j < array[i].length; j++) {
						if (array[i][j] == 'A') {
							startX = i;
							startY = j;
						}
					}
				}
			}
			System.out.println(bfs(array, startX, startY));
		}
	}

	static int bfs(char[][] array, int startX, int startY) {
		boolean[][] visited = new boolean[array.length][array[0].length];
		visited[startX][startY] = true;
		int[][] distance = new int[array.length][array[0].length];

		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();

		qx.add(startX);
		qy.add(startY);

		while (!qx.isEmpty()) {
			int x = qx.poll();
			int y = qy.poll();

			for (int i = -1; i <= 1; i += 2) {
				if (x+i >= 0 && x+i < array.length && !visited[x+i][y]) {
					visited[x+i][y] = true;
					distance[x+i][y] = distance[x][y] + 1;

					if (array[x+i][y] != '#') {
						qx.add(x+i);
						qy.add(y);
						if (array[x+i][y] == 'B') {
							return distance[x+i][y];
						}
					}
				}

				if (y+i >= 0 && y+i < array[0].length && !visited[x][y+i]) {
					visited[x][y+i] = true;
					distance[x][y+i] = distance[x][y] + 1;

					if (array[x][y+i] != '#') {
						qx.add(x);
						qy.add(y+i);
						if (array[x][y+i] == 'B') {
							return distance[x][y+i];
						}
					}
				}

				for (int j = -1; j <= 1; j += 2) {
					if (x+i >= 0 && x+i < array.length && y+j >= 0 && y+j < array[0].length && !visited[x+i][y+j]) {// what is efficiency anyway?
						visited[x+i][y+j] = true; // above probably could be refactored into double for loops instead of triple checks
						distance[x+i][y+j] = distance[x][y] + 1;

						if (array[x+i][y+j] != '#') {
							qx.add(x+i);
							qy.add(y+j);
							if (array[x+i][y+j] == 'B') {
								return distance[x+i][y+j];
							}
						}
					}
				}
			}
		}
		return -1;
	}
}