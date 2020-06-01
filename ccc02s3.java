import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class ccc02s3 {
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
		int r = nextInt();
		int c = nextInt();
		char[][] array = new char[r][c];

		for (char[] list : array) {
			for (int i = 0; i < list.length; i++) {
				list[i] = nextInt();
			}
		}

		char[] actions = new char[nextInt()];
		for (int i = 0; i < actions.length; i++) {
			actions[i] = nextInt();
		}

		for (int i = 0; i < // bruteforce?
	}
}
