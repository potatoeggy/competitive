import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;

public class primefactor {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static boolean[] primes = new boolean[10000001];

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
		primes[1] = true;
		for (int i = 3; i * i < primes.length; i += 2) {
			if (! primes[i]) {
				for (int j = i * i; j <= 10000000; j += i) {
					primes[j] = true;
				}
			}
		}
		int times = nextInt();
		
		for (int i = 0; i < times; i++) {
			int num = nextInt();
			int origNum = num;
			
			while (num % 2 == 0) {
				num /= 2;
				System.out.print(2 + " ");
			}

			if (primes[num]) {
				for (int j = 3; j <= origNum / 2; j += 2) {
					if (! primes[j]) {
						while (num % j == 0) {
							System.out.print(j + " ");
							num /= j;
						}
						
						if (num == 1) {
							break;
						}
					}
				}
			} else {
				System.out.print(num);
			}
			System.out.println();
		}
	}
}
