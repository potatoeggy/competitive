import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sandwich {
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
		int queries = nextInt();
		char[] array = br.readLine().toCharArray();

		for (int i = array.length; i >= 1; i--) {
			if (array[i-1] == '1') {
				System.out.println(i);
			}
		}
		
		for (int i = 1; i <= array.length; i++) {
			if (array[i-1] == '0') {
				System.out.println(i);
			}
		}
	}
}
