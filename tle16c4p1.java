import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer; // i'm imcompetent

public class tle16c4p1 {
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int[] array = new int[nextInt()];

		for (int i = 0; i < array.length; i++) {
			array[i] = nextInt();
		}

		Arrays.sort(array);

		int max = array[array.length-1];

		int c = 1;
		System.out.println("potat");
		for (int i = 0; i < array.length; i++) {
			if (array[i] <= max) {
				max -= array[i];
				if (array[i] < max) {
					max = array[i];
				}
				System.out.println(max + " " + array[i]);
				c++;
			}
		}
		System.out.println(c);
	}
}