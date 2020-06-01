import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ccc19s1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		char[] steps = br.readLine().trim().toCharArray();
		int[][] array = {{1, 2}, {3, 4}};

		int temp;
		for (char c : steps) {
			if (c == 'H') {
				temp = array[0][0];
				array[0][0] = array[1][0];
				array[1][0] = temp;

				temp = array[0][1];
				array[0][1] = array[1][1];
				array[1][1] = temp;
			} else {
				temp = array[0][0];
				array[0][0] = array[0][1];
				array[0][1] = temp;

				temp = array[1][0];
				array[1][0] = array[1][1];
				array[1][1] = temp;
			}
		}

		for (int[] list : array) {
			System.out.println(list[0] + " " + list[1]);
		}
	}
}
