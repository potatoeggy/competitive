import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class phantom2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public static void main(String[] args) throws IOException {
		boolean[] primes = new boolean[1000001];
		primes[1] = true;
		for (int i = 3; i * i < primes.length; i += 2) {
			if (! primes[i]) {
				for (int j = i * i; j <= 1000000; j += i) {
					primes[j] = true;
				}
			}
		}
		int cases = nextInt();
		for (int i = 0; i < cases; i++) { // i don't understand the question
			int c = 0;
			int base = nextInt();
			int ceil = nextInt();
			for (int j = base; j < ceil; j++) {
				if (!primes[j]) {
					c++;
				}
			}
			System.out.println(c);
		}
	}
}
