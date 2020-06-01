import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class gfssoc2j4 {
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
		int queries = nextInt();
		for (int i = 0; i < trees.length; i++) {
			trees[i] = nextInt();
			try {
				trees[i] += trees[i-1];
			} catch (Exception e) {
				//expected for 0
			}
		}

		for (int i = 0; i < queries; i++) {
			int x = nextInt();
			int y = nextInt();
			int acc = trees[trees.length-1];
			acc -= trees[y-1];
			try {
				acc += trees[x-2];
			} catch (Exception e) {
				// expected for 0
			}
			
			System.out.println(acc);
		}
	}
}
