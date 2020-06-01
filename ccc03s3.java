import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ccc03s3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int flooring = Integer.parseInt(br.readLine());

		char[][] array = new char[Integer.parseInt(br.readLine())][Integer.parseInt(br.readLine())];

		for (int i = 0; i < array.length; i++) {
			array[i] = br.readLine().toCharArray();
		}

		boolean[][] visited = new boolean[array.length][array[0].length];
		List<Integer> sizes = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] != 'I' && ! visited[i][j]) {
					visited[i][j] = true;
					sizes.add(bfs(array, visited, i, j));
				}
			}
		}

		Collections.sort(sizes, Collections.reverseOrder());

		int rooms = 0;
		for (int i : sizes) {
			if (flooring >= i) {
				rooms++;
				flooring -= i;
			} else {
				break;
			}
		}
		System.out.println(rooms + " room" + (rooms == 1 ? "" : "s") + ", " + flooring + " square metre(s) left over");
	}

	static int bfs(char[][] array, boolean[][] visited, int startX, int startY) {
		int acc = 1;
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		
		qx.add(startX);
		qy.add(startY);

		while (! qx.isEmpty()) {
			int x = qx.poll();
			int y = qy.poll();

			for (int i = -1; i <= 1; i += 2) {
				if (x+i >= 0 && x+i < array.length && !visited[x+i][y]) {
					visited[x+i][y] = true;
					if (array[x+i][y] != 'I') {
						acc++;
						qx.add(x+i);
						qy.add(y);
					}
				}

				if (y+i >= 0 && y+i < array[0].length && !visited[x][y+i]) {
					visited[x][y+i] = true;
					if (array[x][y+i] != 'I') {
						acc++;
						qx.add(x);
						qy.add(y+i);
					}
				}
			}
		}
		return acc;
	}
}