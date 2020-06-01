import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


// NumberFormatException + ArrayIndexOutOfBounds + WA + 1 AC

// ask james

public class dmopc14c1p5 {
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
		int startX = nextInt();
		int startY = nextInt();
		int destX = nextInt();
		int destY = nextInt();

		for (int i = 0; i < array.length; i++) {
			array[i] = br.readLine().toCharArray();
		}

		int[] altX = new int[nextInt()];
		int[] altY = new int[altX.length];
		
		for (int i = 0; i < altX.length; i++) {
			altX[i] = nextInt();
			altY[i] = nextInt();
		}

		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		boolean[][] visited = new boolean[array.length][array[0].length];
		int[][] distance = new int[array.length][array[0].length];

		visited[startX][startY] = true;
		qx.add(startX);
		qy.add(startY);

		while (! qx.isEmpty()) {
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

		int lowestAltTime = Integer.MAX_VALUE;

		for (int i = 0; i < altX.length; i++) {
			if (distance[altX[i]][altY[i]] < lowestAltTime && visited[altX[i]][altY[i]]) {
				lowestAltTime = distance[altX[i]][altY[i]];
			}
		}
		System.out.println(distance[destX][destY] > lowestAltTime ? distance[destX][destY] - lowestAltTime : 0);
	}
}
		
