import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class gfssoc2j2 {
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
		for (int i = 1; i <= times; i++) {
			boolean fuzz = false;
			if (i % 7 == 0) {
				System.out.print("Fizz ");
				fuzz = true;
			}

			if (i % 13 == 0) {
				System.out.print("Fuzz ");
				fuzz = true;
			}

			if (!fuzz) {
				System.out.print(i + " ");
			}
			
			fuzz = false;
			if ((2 * i - 1) % 7 == 0) {
				System.out.print("Fizz");
				fuzz = true;
			}

			if ((2 * i - 1) % 13 == 0) {
				System.out.print(fuzz ? " Fuzz" : "Fuzz");
				fuzz = true;
			}

			if (!fuzz) {
				System.out.print(2 * i - 1);
			}
			System.out.println();
		}
	}
}
