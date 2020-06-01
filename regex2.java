import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class regex2 { // broken
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return st.nextToken();
	}

	public static void main(String[] args) throws IOException {
		String[] array = new String[Integer.parseInt(br.readLine())];

		for (int i = 0; i < array.length; i++) {
			array[i] = br.readLine();
			String[] temp = array[i].split(" ");
			for (int j = 0; j < temp.length; j++) {
				if (temp[j].replaceAll("[\\W]|_", "").length() == 4) {
					temp[j] = temp[j].replaceAll("[\\W]|_", "****");
				}
				System.out.print(temp[j] + " ");
			}
		}
	}
}
