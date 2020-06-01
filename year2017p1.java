import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class year2017p1 {
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
		int queries = nextInt();
		for (int i = 0; i < queries; i++) {
			String query = next();
			int student = nextInt();
			if (query.equals("F")) {
				array.add(0, student);
			} else if (query.equals("E")) {
				array.add(student);
			} else {
				for (int j = 0; j < array.size(); j++) {
					if (array.get(j).equals(student)) {
						array.remove(j);
						break;
					}
				}
			}
		}
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
	}
}
