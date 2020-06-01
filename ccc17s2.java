import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ccc17s2 {
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
		int[] array = new int[nextInt()];
		for (int i = 0; i < array.length; i++) {
			array[i] = nextInt();
		}
		int[] arraySort = array.clone();
		Arrays.sort(arraySort);
		
		int half = array.length / 2;
		if (array.length % 2 != 0) {
			half++;
		}
		
		for (int i = 0; i < half; i++) {
			System.out.print(array[i] + " " + array[i + half] + " ");
		}
	}
}
