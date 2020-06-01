import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ccc18s2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException{
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public static void main(String[] args) throws IOException {
		int size = nextInt();

		int[][] array = new int[size][size];

		for (int[] list : array) {
			for (int i = 0; i < list.length; i++) {
				list[i] = nextInt();
			}
		}

		int min = 2147483647;
		int iindex = 0;
		int jindex = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (min > array[i][j]) {
					min = array[i][j];
					iindex = i;
					jindex = j;
				}
			}
		}

		for (int i 
	}
}
