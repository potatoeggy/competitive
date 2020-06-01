import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class ccc08s3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int times = Integer.parseInt(br.readLine());
		for (int i = 0; i < times; i++) {
			char[][] array = new char[Integer.parseInt(br.readLine())][Integer.parseInt(br.readLine())];

			for (int j = 0; j < array.length; j++) {
				array[j] = br.readLine().toCharArray();
			}
			System.out.println(bfs(array));
		}
	}

	static int bfs(char[][] array) {
		if (array.length == 1 && array[0].length == 1) return 1;
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();

		boolean[][] visited = new boolean[array.length][array[0].length];
		int[][] distance = new int[array.length][array[0].length];
		visited[0][0] = true;
		distance[0][0] = 1;
		
		qx.add(0);
		qy.add(0);

		while (!qx.isEmpty()) {
			int x = qx.poll();
			int y = qy.poll();
			if (array[x][y] == '|' || array[x][y] == '+') {
				for (int i = -1; i <= 1; i += 2) {
					if (x+i >= 0 && x+i < array.length && !visited[x+i][y]) {
						visited[x+i][y] = true;
						distance[x+i][y] = distance[x][y] + 1;
						if (array[x+i][y] != '*') {
							qx.add(x+i);
							qy.add(y);
							if (x+i == array.length-1 && y == array[0].length-1) {
								return distance[x+i][y];
							}
						}
					}
				}
			}
			
			if (array[x][y] == '-' || array[x][y] == '+') {
				for (int i = -1; i <= 1; i += 2) {
					if (y+i >= 0 && y+i < array[0].length && !visited[x][y+i]) {
						visited[x][y+i] = true;
						distance[x][y+i] = distance[x][y] + 1;
						if (array[x][y+i] != '*') {
							qx.add(x);
							qy.add(y+i);
							if (x == array.length-1 && y+i == array[0].length-1) {
								return distance[x][y+i];
							}
						}
					}
				}
			}
		}
		return -1;
	}
}
