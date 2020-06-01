import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class si17c1p9 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		char[][] array = new char[nextInt()][nextInt()];

		for (int i = 0; i < array.length; i++) {
			array[i] = br.readLine().toCharArray();
		}

		int safe = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] != 'S') {
					int local = 0;
					int half = 8;
					for (int x = -1; x <= 1; x++) {
						for (int y = -1; y <= 1; y++) {
							if (i+x >= 0 && i+x < array.length && j+y >= 0 && j+y < array.length) {
								if (array[i+x][j+y] == 'S') {
									local++;
								}
							} else {
								half--;
							}
						}
					}
					System.out.println(half); // whats wrong
					if (local < half/2) {
						safe++;
					}
				}
			}
		}
		System.out.println(safe);
	}
}