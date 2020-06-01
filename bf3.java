import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bf3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine().trim());

		if (x == 1) {
			System.out.println(2);
			return;
		}
		
		boolean notPrime = true;
		for (int i = x; notPrime; i++) {
			notPrime = false;
			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					notPrime = true;
				}
			}

			if (! notPrime) {
				System.out.println(i);
			}
		}
	}
}
