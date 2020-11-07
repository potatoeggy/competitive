import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dmopc19c6p4hard {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
		return Integer.parseInt(st.nextToken());
	}
	public static void main(String[] args) {
	}

	static class Bit {
		int[] base;
		public Bit(int size) {
			base = new int[size];
		}
		void update(int position, int value) {}
	}
}
