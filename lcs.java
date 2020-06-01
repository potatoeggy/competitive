import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class lcs {
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
		Integer[] x = new Integer[nextInt()];
		Integer[] y = new Integer[nextInt()];
		for (int i = 0; i < x.length; i++) {
			x[i] = nextInt();
		}

		for (int i = 0; i < y.length; i++) {
			y[i] = nextInt();
		}
		
		Arrays.sort(x);
		Arrays.sort(y);

		Integer[] shortest = x.length > y.length ? y : x;
		Integer[] longest = x.length > y.length ? x : y;

		int c = 0;
		for (int i = 0; i < shortest.length; i++) {
			if (Arrays.asList(longest).contains(shortest[i])) { // subsequence means that they have to be in order just not consecutive
				c++;
			}
		}
		System.out.println(c);
	}
}
