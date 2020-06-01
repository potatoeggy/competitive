import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class gfssoc2j5 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		Integer[] episodes = new Integer[nextInt()];
		int queries = nextInt();

		for (int i = 0; i < episodes.length; i++) {
			episodes[i] = nextInt();
		}

		for (int i = 0; i < queries; i++) {
			int x = nextInt();
			int y = nextInt();
			Integer[] tempArray = episodes.clone();

			for (int j = x; j <= y; j++) {
				tempArray[j] = 0;
			}

			Arrays.sort(tempArray);
			for (int j = tempArray.length-2; j >= 0; j--) {
				if (tempArray[j] != tempArray[j+1]) {
					System.out.println(tempArray[tempArray.length-1] + " " + (tempArray.length-j-1));
					break; // TLE
				}
			}
		}
	}
}