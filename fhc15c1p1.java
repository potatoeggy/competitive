import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class fhc15c1p1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	
	static int nextInt() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}
	
	public static void main(String[] args) throws IOException {
		boolean[] primes = new boolean[1000001];
		int[] primacity = new int[1000001];
		primes[1] = true;
		for (int i = 3; i < primes.length; i += 2) {
			if (! primes[i]) {
				for (int j = Math.abs(i * i); j <= 1000000; j += i) {
					primes[j] = true;
				}
				primacity[i] = primacity[i-1] + 1;
			}
		}
		
		int cases = nextInt(); // it's not going past input? or the initial load is taking a long time
		for (int i = 0; i < cases; i++) {
			int x = nextInt();
			int y = nextInt();
			int wantedPrimacity = nextInt();
			
			int c = 0;
			for (int j = x; j <= y; j++) {
				int primaTemp = 0;
				if (j % 2 == 0) {
					primaTemp++;
				}
				
				for (int k = 3; k <= j; k += 2) {
					if (! primes[k]) {
						if (j % k == 0) {
							primaTemp++;
						}
					}
				}
				
				if (primaTemp == wantedPrimacity) {
					c++;
				}
			}
			System.out.println("Case #" + (i+1) + ": " + c);
		}
	}
}
