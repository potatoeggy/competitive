import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;

public class dmopc14c1p3 {
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
		List<Integer> array = new ArrayList<Integer>();
		array.add(0);

		int x = nextInt();
		for (int i = 1; i <= x; i++) {
			array.add(nextInt() + array.get(i-1));
		}

		int y = nextInt();
		for (int i = 0; i < y; i++) {
			array.add(nextInt() + array.get(array.size()-1));
			System.out.println(String.format("%.3f", (double) array.get(array.size()-1) / (array.size() - 1)));
		}
	}
}
