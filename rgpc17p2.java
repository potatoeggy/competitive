import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class rgpc17p2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		long[] cubes = new long[nextInt()+1];
		int[] map = new int[1000001];
		int needed = nextInt();
		int queries = nextInt();

		for (int i = 1; i < cubes.length; i++) {
			int temp = nextInt();
			cubes[i] = temp+cubes[i-1];
			map[temp] = i;
		}

		for (int i = 0; i < queries; i++) {
			int start = nextInt();
			int end = nextInt();
			System.out.println((cubes[map[end]]-cubes[map[start]-1]) >= 2*needed ? "Enough" : "Not enough");
		}
	}
}