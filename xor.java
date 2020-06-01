import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class xor {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}
	
	public static void main(String[] args) throws IOException {
		int[] array = new int[1000000001]; // too big
		for (int i = 1; i < array.length; i++) {
			array[i] = array[i-1] ^ i;
		}
		int times = nextInt();
		for (int i = 0; i < times; i++) {
			int x = nextInt();
			int y = nextInt();

			/*
			int holder = x;
			for (int j = x; j < y; j++) {
				holder ^= j + 1; // too slow
			}
			*/
			System.out.println(array[y] ^ array[x]);
		}
	}
}
