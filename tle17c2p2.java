import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class tle17c2p2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int[] unlucky = new int[1000001];
		int[] array = new int[unlucky.length];

		int queries = nextInt();

		for (int i = 0; i < queries; i++) {
			unlucky[nextInt()]++;
		}

		for (int i = 1; i < unlucky.length; i++) {
			array[i] = array[i-1] + unlucky[i];
		}

		queries = nextInt();
		for (int i = 0; i < queries; i++) {
			int temp = nextInt();
			System.out.println(temp-array[temp]);
		}
	}
}