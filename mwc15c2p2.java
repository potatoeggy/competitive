import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class mwc15c2p2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	static int nextInt() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int[] heights = new int[nextInt()];
		int[] future = new int[heights.length];

		heights[0] = nextInt();
		System.out.print(0 + " ");

		for (int i = 1; i < heights.length; i++) {
			heights[i] = nextInt();
			boolean lower = false;
			for (int j = i-1; j >= 0;) {
				if (heights[j] == heights[i]) {
					future[i] += future[j];
					if (!lower) future[i]++;
					break;
				} else if (heights[j] > heights[i]) {
					future[i] = i - j;
					break;
				} else {
					future[i] += future[j] + 1;
					if (!lower) future[i]++;
					if (j == 0) break;
					lower = true;
					j -= future[j];
				}
			}
			System.out.print(future[i] + " ");
		}
	}
}
