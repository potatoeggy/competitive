import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class dmpg15s5 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int size = nextInt();
		int[][] array = new int[size][size];

		int queries = nextInt();

		int c = 0;
		for (int i = 0; i < queries; i++) {
			int startx = nextInt();
			int starty = nextInt();
			int endx = nextInt();
			int endy = nextInt();

			for (int j = startx; j < startx+endx; j++) {
				pleaseDontCallTooMuch(array, j, starty, endy);
			}

		}

		int buffer = 0;
		List<Integer> multiplierBuffer = new ArrayList<Integer>();
		int multiplier = 0;
		for (int[] list : array) {
			for (int i = 0; i < list.length; i++) {
				if (buffer == 0) {
					if (list[i] == 0) {
						continue;
					} else {
						buffer = list[i];
					}
				} else {
					if (multiplier % 2 == 0) { // this is sketchy don't do use 2d diff array
						continue; // it'd be funny if it worked tho
					} else {
						buffer--;
						// handle multiplier checking
					}
				}
			}
		}

		System.out.println(c);
	}

	static void pleaseDontCallTooMuch(int[][] array, int j, int starty, int endy) {
		if (endy == 0) return;
		if (array[j][starty] == endy) {
			array[j][starty] = 0;
		} else if (array[j][starty] < endy) {
			pleaseDontCallTooMuch(array, j, starty+array[j][starty], endy-array[j][starty]);
			array[j][starty] = 0;
		} else {
			pleaseDontCallTooMuch(array, j, starty+endy, 0);
			array[j][starty] = 0;
		}
	}
}