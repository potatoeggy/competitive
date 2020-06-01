import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dmopc14c2p4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int[] trees = new int[nextInt()];
		for (int i = 0; i < trees.length; i++) {
			trees[i] = nextInt();
			try {
				trees[i] += trees[i-1];
			} catch (Exception e) {
				//expected for 0
			}
		}

		int queries = nextInt();
		int q1;
		int q2;
		for (int i = 0; i < queries; i++) {
			q1 = nextInt();
			q2 = nextInt();

			System.out.println(q1 > 0 ? trees[q2] - trees[q1-1] : trees[q2]);
		}
	}
}
