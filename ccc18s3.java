import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class ccc18s3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int lines = nextInt();
		int columns = nextInt();

		char[][] inputGrid = new char[lines][columns];
		char[][] grid = new char[lines][columns];
		List<Integer> desx = new ArrayList<Integer>();
		List<Integer> desy = new ArrayList<Integer>();

		for (int i = 0; i < lines; i++) {
			inputGrid[i] = br.readLine().toCharArray();
		}

		int startx = 0;
		int starty = 0;
		for (int i = 0; i < inputGrid.length; i++) {
			for (int j = 0; j < inputGrid[0].length; j++) {
				if (inputGrid[i][j] == '.') {
					desx.add(i);
					desy.add(j);
				}

				if (inputGrid[i][j] == 'S') {
					startx = i;
					starty = j;
					if (grid[i][j] != 'W') grid[i][j] = '.';
				} else if (inputGrid[i][j] == 'C') {
					for (int k = -1; k <= 1; k += 2) {
						for (int big = i; inputGrid[big][j] != 'W'; big += k) {
							if (inputGrid[big][j] == '.' || inputGrid[big][j] == 'S') {
								grid[big][j] = 'W';
							}
						}

						for (int big = j; inputGrid[i][big] != 'W'; big += k) {
							if (inputGrid[i][big] == '.' || inputGrid[i][big] == 'S') {
								grid[i][big] = 'W';
							}
						}
					}
					grid[i][j] = 'W';
				} else if (grid[i][j] != 'W') {
					grid[i][j] = inputGrid[i][j];
				}
			}
		}

		int[][] distance = new int[lines][columns];
		boolean[][] visited = new boolean[lines][columns];
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();

		if (grid[startx][starty] != 'W') {
			visited[startx][starty] = true;
			qx.add(startx);
			qy.add(starty);
		}

		int modx = 0;
		int mody = 0;
		while (!qx.isEmpty()) {
			int x = qx.poll();
			int y = qy.poll();

			if (grid[x][y] == 'W') continue;
			if (grid[x][y] != '.') {
				if (grid[x][y] == 'U') {
					modx = -1;
				} else if (grid[x][y] == 'D') {
					modx = 1;
				} else if (grid[x][y] == 'L') {
					mody = -1;
				} else {
					mody = 1;
				}
				if (!visited[x+modx][y+mody] || distance[x][y] < distance[x+modx][y+mody]) {
					if (grid[x+modx][y+mody] != 'W') {
						qx.add(x+modx);
						qy.add(y+mody);
						distance[x+modx][y+mody] = distance[x][y];
						visited[x+modx][y+mody] = true;
					}
				}
				modx = 0;
				mody = 0;
				continue;
			}

			for (int i = -1; i <= 1; i += 2) {
				if (!visited[x+i][y] || distance[x][y]+1 < distance[x+i][y]) {
					if (grid[x+i][y] != 'W') {
						qx.add(x+i);
						qy.add(y);
						visited[x+i][y] = true;
						distance[x+i][y] = distance[x][y] + 1;
					}
				}
				if (!visited[x][y+i] || distance[x][y]+1 < distance[x][y+i]) {
					if (grid[x][y+i] != 'W') {
						qx.add(x);
						qy.add(y+i);
						visited[x][y+i] = true;
						distance[x][y+i] = distance[x][y] + 1;
					}
				}
			}
		}

		for (int i = 0; i < desx.size(); i++) {
			int holdx = desx.get(i);
			int holdy = desy.get(i);
			System.out.println(visited[holdx][holdy] ? distance[holdx][holdy] : -1);
		}
	}
}