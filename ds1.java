import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ds1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine());
		}
		return st.nextToken();
	}
	public static void main(String[] args) throws IOException {
		int[] original = new int[Integer.parseInt(next())+1];
		long[] bit = new long[100001];
		long[] freqBit = new long[100001];

		int commands = Integer.parseInt(next());

		for (int i = 1; i < original.length; i++) {
			original[i] = Integer.parseInt(next());
			update(bit, i, original[i]);
			update(freqBit, original[i], 1);
		}

		for (int i = 0; i < commands; i++) {
			String com = next();
			if (com.equals("Q")) {
				int value = Integer.parseInt(next());
				System.out.println(query(freqBit, value));
			} else {
				int x = Integer.parseInt(next()), y = Integer.parseInt(next());
				if (com.equals("C")) {
					update(bit, x, -original[x]+y);
					update(freqBit, original[x], -1);
					update(freqBit, y, 1);
					original[x] = y;
				} else if (com == "S") {
					System.out.println(query(bit, y) - query(bit, x-1));
				}
			}
		}
	}

	static void update(long[] bit, int position, int value) {
		for (int i = position; i < bit.length; i += i & -i) bit[i] += value;
	}

	static long query(long[] bit, int position) {
		long sum = 0;
		for (int i = position; i >= 1; i -= i & -i) sum += bit[i];
		return sum;
	}
}