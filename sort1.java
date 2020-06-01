import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class sort1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws Exception {
		int[] array = new int[nextInt()];
		for (int i = 0; i < array.length; i++) {
			array[i] = nextInt();
		}

		int temp;
		boolean sorted = false;

		System.out.println(Arrays.toString(array).replace("[", "").replace("]", "").replace(",", ""));
		for (int i = 0; ! sorted; i++) {
			sorted = true;
			for (int j = 1; j < array.length - i; j++) {
				if (array[j-1] > array[j]) {
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
					sorted = false;
					System.out.println(Arrays.toString(array).replace("[", "").replace("]", "").replace(",", ""));
				}
			}
		}
	}
}
