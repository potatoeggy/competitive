import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class dmopc17c5p3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static Long nextLong() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Long.parseLong(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		Long[] array = new Long[Integer.parseInt(nextLong().toString())];

		for (int i = 0; i < array.length; i++) {
			array[i] = nextLong();
		}

		long factor = array[0];

		for (int i = 1; i < array.length; i++) {
			factor = gcf(factor, array[i]);
		}

		for (long i = factor; i >= 2; i--) {
			if (factor % i == 0 && BigInteger.valueOf(i).isProbablePrime(1)) { // why is this broken
				System.out.println(i);
				break;
			}
		}
	}

	static long gcf(long x, long y) {
		if (y == 0) return x;
		return gcf(y, x % y);
	}
}