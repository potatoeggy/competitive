import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class denoun {
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
		int lines = nextInt();
		for (int i = 0; i < lines; i++) {
			String[] line = br.readLine().split(" ");
			int nouns = 0;
			for (int j = 0; j < line.length; j++) {
				if (Character.isUpperCase(line[j].charAt(0))) {
					nouns++;
				}
			}
			System.out.println(nouns);
		}
	}
}
