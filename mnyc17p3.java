import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mnyc17p3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return st.nextToken();
	}

	public static void main(String[] args) throws IOException {
		String x = next();
		String y = next();

		for (int i = y.length(); i >= 0; i--) {
			if (x.endsWith(y.substring(0, i))) {
				System.out.println(x + y.substring(i));
				break;
			}
		}
	}
}
