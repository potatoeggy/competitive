import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class ccc10j5 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int[][] distance = new int[9][9];
		boolean[][] visited = new boolean[9][9];

		int startx = nextInt();
		int starty = nextInt();

		int endx = nextInt();
		int endy = nextInt();

		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();

		qx.add(startx);
		qy.add(starty);
		visited[startx][starty] = true;

		boolean found = false;
		while (! qx.isEmpty()) {
			int x = qx.poll();
			int y = qy.poll();

			for (int i = -2; i <= 2; i += 4) {
				for (int j = -1; j <= 1; j += 2) {
					if (x + i > 0 && x + i < distance.length && y + j > 0 && y + j < distance.length) {
						if (! visited[x + i][y + j]) {
							visited[x+i][y+j] = true;
							distance[x+i][y+j] = distance[x][y] + 1;
							qx.add(x+i);
							qy.add(y+j);
							if (x+i == endx && y+j == endy) {
								found = true;
								break;
							}
						}
					}

					if (x + j > 0 && x + j < distance.length && y + i > 0 && y + i < distance.length) {
						if (! visited[x + j][y + i]) {
							visited[x+j][y+i] = true;
							distance[x+j][y+i] = distance[x][y] + 1;
							qx.add(x+j);
							qy.add(y+i);
							if (x+j == endx && y+i == endy) {
								found = true;
							}
						}
					}
					
					if (found) {
						break;
					}
				}
				if (found) {
					break;
				}
			}
		}

		System.out.println(distance[endx][endy]);
	}
}
