import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class phantom1 {
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
		boolean[] primes = new boolean[500];
		primes[1] = true;
		for (int i = 4; i < primes.length; i += 2) {
			primes[i] = true;
		}
		
		for (int i = 3; i < primes.length; i += 2) {
			if (! primes[i]) {
				for (int j = i * i; j < primes.length; j += i) {
				primes[j] = true;
				}
			}
		}
		
		int times = nextInt();
		for (int i = 0; i < times; i++) {
			int x = nextInt();
			int y = nextInt();
			int c = 0;

			for (int j = x; j < y; j++) {
				if (!primes[j]) {
					c++;
				}
			}
			System.out.println(c);
		}
	}
}
