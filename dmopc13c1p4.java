import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class dmopc13c1p4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int cases = nextInt();

		for (int i = 0; i < cases; i++) {
			int size1 = nextInt();
			int size2 = nextInt();
			ArrayList<Integer> startX = new ArrayList<Integer>();
			ArrayList<Integer> startY = new ArrayList<Integer>();
			 
			char[][] array = new char[size2][size1];

			for (int j = 0; j < array.length; j++) {
				array[j] = br.readLine().toCharArray();
				for (int k = 0; k < array[j].length; k++) {
					if (array[j][k] == 'C') {
						startX.add(j);
						startY.add(k);
					}
				}
			}

			bfs(array, startX, startY);
		}
	}

	static void bfs(char[][] array, ArrayList<Integer> startX, ArrayList<Integer> startY) {
		Queue<Integer> qx = new LinkedList<Integer>();
		Queue<Integer> qy = new LinkedList<Integer>();
		boolean[][] visited = new boolean[array.length][array[0].length];
		int[][] distance = new int[array.length][array[0].length];

		int lowestDist = Integer.MAX_VALUE;

		for (int i = 0; i < startX.size(); i++) {
			visited[startX.get(i)][startY.get(i)] = true;
			qx.add(startX.get(i));
			qy.add(startY.get(i));
		}

		while (! qx.isEmpty()) {
			int x = qx.poll();
			int y = qy.poll();

			for (int i = -1; i <= 1; i += 2) {
				if (x+i >= 0 && x+i < array.length && ! visited[x+i][y]) {
					visited[x+i][y] = true;
					distance[x+i][y] = distance[x][y] + 1;
					if (array[x+i][y] != 'X') {
						qx.add(x+i);
						qy.add(y);
						if (array[x+i][y] == 'W' && distance[x+i][y] < lowestDist) {
							lowestDist = distance[x+i][y];
						}
					}
				}

				if (y+i >= 0 && y+i < array[0].length && !visited[x][y+i]) {
					visited[x][y+i] = true;
					distance[x][y+i] = distance[x][y] + 1;
					if (array[x][y+i] != 'X') {
						qx.add(x);
						qy.add(y+i);
						if (array[x][y+i] == 'W' && distance[x][y+i] < lowestDist) {
							lowestDist = distance[x][y+i];
						}
					}
				}
			}

		}

		if (lowestDist >= 60) {
			System.out.println("#notworth");
		} else {
			System.out.println(lowestDist);
		}
	}
}
