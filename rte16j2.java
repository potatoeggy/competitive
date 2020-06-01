import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class rte16j2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public static void main(String[] args) throws IOException {
		int queries = nextInt();
		List<Integer> blues = new ArrayList<Integer>();
		List<Integer> pinks = new ArrayList<Integer>();
		List<Integer> greens = new ArrayList<Integer>();

		for (int i = 0; i < queries; i++) {
			String query = next();
			if (query.equals("ADD")) {
				String colour = next();
				int num = nextInt();
				if (colour.equals("BLUE")) {
					blues.add(num);
				} else if (colour.equals("PINK")) {
					pinks.add(num);
				} else {
					greens.add(num);
				}
			} else {
				if (blues.isEmpty()) {
					if (pinks.isEmpty()) {
						if (greens.isEmpty()) {
							System.out.println("NONE");
						} else {
							Collections.sort(greens);
							System.out.println("GREEN " + greens.get(0));
							greens.remove(0);
						}
					} else {
						Collections.sort(pinks);
						System.out.println("PINK " + pinks.get(0));
						pinks.remove(0);
					}
				} else {
					Collections.sort(blues);
					System.out.println("BLUE " + blues.get(0));
					blues.remove(0);
				}
			}
		}
	}
}