import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class coci08c5p2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int m, n;
		int x = m = nextInt();
		int y = n = nextInt();

		int temp;
		while (m != n) {
			temp = m;
			m = n;
			n = temp > n ? temp - n : temp;
		}
		for (int i = 1; i <= m; i++) {
			if (m % i == 0) {
				System.out.println(i + " " + x / i + " " + y / i);
			}
		}
	}
}