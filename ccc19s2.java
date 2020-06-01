import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ccc19s2 {
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
		int times = nextInt();
		boolean[] primes = new boolean[2000001];
		primes[1] = true;
		for (int i = 3; i * i < primes.length; i += 2) {
			if (! primes[i]) {
				for (int j = i * i; j <= 2000000; j += i) {
					primes[j] = true;
				}
			}
		}
			
		int num;
		boolean solved;
		for (int i = 0; i < times; i++) {
			num = nextInt();
			solved = false;
			for (int j = num; j >= 2; j -= 2) {
				if (j % 2 == 0 && j != 2) j++;
				if (! solved) {
					for (int k = num; k <= num * 2; k += 2) {
						if (k % 2 == 0) k--;
						if (2 * num < j + k) break;
						if (!primes[j]) {
							if (!primes[k]) {
								if (2 * num == j + k) {
									System.out.println(j + " " + k);
									solved = true;
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
