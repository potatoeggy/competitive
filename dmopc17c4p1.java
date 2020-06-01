import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dmopc17c4p1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int[] ribbon = new int[nextInt()];
		int times = nextInt();

		for (int i = 0; i < times; i++) {
			int start = nextInt();
			int end = nextInt();
			if (ribbon[start] < end-start) {
				ribbon[start] = end-start;
			}
		}

		int buffer = 0;
		int acc = 0;
		for (int i = 0; i < ribbon.length; i++) {
			if (ribbon[i] > buffer) {
				buffer = ribbon[i];
			}

			if (buffer != 0) {
				buffer--;
			} else {
				acc++;
			}
		}
		System.out.println(acc + " " + (ribbon.length-acc));
	}
}