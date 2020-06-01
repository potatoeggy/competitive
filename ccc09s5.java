import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc09s5 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int[][] grid = new int[nextInt()+1][nextInt()+1];
		int[][] shops = new int[nextInt()][3];

		int max = 0;
		for (int i = 0; i < shops.length; i++) {
			int x = nextInt();
			int y = nextInt();
			int range = nextInt();
			shops[i][0] = x;
			shops[i][1] = y;
			shops[i][2] = range;
			int br = nextInt();

			for (int j = -range; j <= range; j++) {
				for (int k = -range; k <= range; k++) { // ugh triple for loop
					if (x+j > 0 && y+k > 0 && x+j < grid.length && y+k < grid[0].length) {
						grid[x+j][y+k] += br;
						if (grid[x+j][y+k] > max) {
							max = grid[x+j][y+k];
						}
					}
				}
			}
		}

		int topShops = 0;

		for (int i = 0; i < shops.length; i++) {
			for (int j = -shops[i][2]; j <= shops[i][2]; j++) {
				for (int k = -shops[i][2]; k <= shops[i][2]; k++) { // UGH
					int x = shops[i][0];
					int y = shops[i][1];
					if (x+j > 0 && y+k > 0 && x+j < grid.length && y+k < grid[0].length) {// it's a circle not square
						if (grid[x+j][y+k] == max) {
							topShops++;
						}
					}
				}
			}
		}
		
		for (int[] list : grid) {
			for (int i : list) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println(max);
		System.out.println(topShops);
	}
}