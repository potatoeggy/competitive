import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer; // simulation-ish, handle more situations as in editorial

public class ccc19s3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public static void main(String[] args) throws IOException {
		int[][] array = new int[3][3];
		for (int[] list : array) {
			for (int i = 0; i < list.length; i++) {
				try {
					list[i] = nextInt();
				} catch (java.lang.NumberFormatException e) {
					list[i] = 0;
				}
			}
		}

		int c;
		int index;
		int filledIndex;
		boolean filled = false;
		for (boolean secondTime = false; ! filled; secondTime = true) {
			filled = true;
			for (int[] list : array) {
				c = 0;
				index = 0;
				filledIndex = 0;
				for (int i = 0; i < list.length; i++) {
					if (list[i] == 0) {
						index = i;
						c++;
					} else {
						filledIndex = i;
					}
				}

				if (c != 0) {
					filled = false;
				}
				
				if (c == 1) {
					if (index == 0) {
						list[index] = (list[1] + list[2]) / 2;
					} else if (index == 1) {
						list[index] = (list[0] + list[2]) / 2;
					} else if (index == 2) {
						list[index] = (list[0] + list[1]) / 2;
					}
				} else if (c >= 2 && secondTime) {
					for (int i = 0; i < list.length; i++) {
						list[i] = list[filledIndex];
					}
				}
			}

			for (int i = 0; i < array.length; i++) { // vertical
				c = 0;
				index = 0;
				filledIndex = 0;
				for (int j = 0; j < array.length; j++) {
					if (array[j][i] == 0) {
						index = i;
						c++;
					} else {
						filledIndex = i;
					}
				}

				if (c != 0) {
					filled = false;
				}
				
				if (c == 1) {
					if (index == 0) {
						array[index][i] = (array[1][i] + array[2][i]) / 2;
					} else if (index == 1) {
						array[index][i] = (array[0][i] + array[2][i]) / 2;
					} else if (index == 2) {
						array[index][i] = (array[1][i] + array[0][i]) / 2;
					}
				} else if (c == 2 && secondTime) {
					for (int j = 0; j < array[i].length; j++) {
						array[j][i] = array[j][filledIndex];
					}
				}
			}
		}
		
		for (int[] list : array) {
			System.out.println(java.util.Arrays.toString(list));
		}
	}
}
