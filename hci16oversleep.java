import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class hci16oversleep {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		char[][] array = new char[nextInt()][nextInt()];

		int startX = -1;
		int startY = -1;

		int endX = -1;
		int endY = -1;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = br.readLine().toCharArray();
			if (startX == -1 || endX == -1) {
				for (int j = 0; j < array[i].length; j++) {
					if (array[i][j] == 's') {
						startX = i;
						startY = j;
					} else if (array[i][j] == 'e') {
						endX = i;
						endY = j;
					}
				}
			}
		}

		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();

		boolean[][] visited = new boolean[array.length][array[0].length];
		int[][] distance = new int[array.length][array[0].length];
		for (int[] list : distance) {
			Arrays.fill(list, -1);
		}

		visited[startX][startY] = true;
		qx.add(startX);
		qy.add(startY);

		while (!qx.isEmpty()) {
			int x = qx.poll();
			int y = qy.poll();

			for (int i = -1; i <= 1; i += 2) {
				if (x+i >= 0 && x+i < array.length && !visited[x+i][y]) {
					visited[x+i][y] = true;
					distance[x+i][y] = distance[x][y] + 1;
					if (array[x+i][y] != 'X') {
						qx.add(x+i);
						qy.add(y);
					}
				}
				
				if (y+i >= 0 && y+i < array[0].length && !visited[x][y+i]) {
					visited[x][y+i] = true;
					distance[x][y+i] = distance[x][y] + 1;
					if (array[x][y+i] != 'X') {
						qx.add(x);
						qy.add(y+i);
					}
				}
			}
		}
		System.out.println(distance[endX][endY]);
	}
}
