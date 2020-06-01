import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ioi00p1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return st.nextToken();
	}

	public static void main(String[] args) throws IOException {
		next();
		char[] string = next().toCharArray();

		int centre = string.length / 2;
		if (string.length % 2 == 0) {
			for (int i = 0; ;);
		} else {
			for (int i = 0; i < centre; i++) { // this will result in imbalances idk how to do this
				if ()
			}
		}
	}
}