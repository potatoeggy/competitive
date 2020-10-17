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
		long times = nextLong();
		long factor = nextLong();
		for (int i = 1; i < times; i++) {
			factor = gcf(factor, nextLong());
		}

		for (long i = 2; i * i <= factor;) {
			if (factor % i != 0) i++;
			else factor /= i;
		}

		System.out.println(factor != 1 ? factor : "DNE");
	}

	static long gcf(long a, long b) {
		while (b != 0) {
			long tmp = a;
			a = b;
			b = tmp;
			b %= a;
		}
		return a;
	}
}