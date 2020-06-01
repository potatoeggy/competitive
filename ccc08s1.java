import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;

public class ccc08s1 {
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
		List<Integer> temp = new ArrayList<Integer>();
		List<String> city = new ArrayList<String>();

		for (int i = 0; true; i++) {
			city.add(next());
			temp.add(nextInt());
			if (city.get(i).equals("Waterloo")) {
				break;
			}
		}
		
		int min = temp.get(0);
		int minIndex = 0;
		for (int i = 1; i < city.size(); i++) {
			if (min > temp.get(i)) {
				min = temp.get(i);
				minIndex = i;
			}
		}
		System.out.println(city.get(minIndex));
	}
}
