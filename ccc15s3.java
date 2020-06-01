import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc15s3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] gates = new boolean[Integer.parseInt(br.readLine()) + 1];

		int c = 0;
		boolean failed;
		int planes = Integer.parseInt(br.readLine());
		for (int i = 0; i < planes; i++) {
			int temp = Integer.parseInt(br.readLine());
			failed = true; // weird i don't know how to do this :( i see the problem
			for (int j = temp; j > 0; j--) { // j-- needs to be faster, james says binary search
				if (!gates[j]) {
					gates[j] = true;
					failed = false;
					c++;
					break;
				}
			}
			if (failed) {
				break;
			}
		}
		System.out.println(c);
	}
}
