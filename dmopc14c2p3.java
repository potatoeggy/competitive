import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class dmopc14c2p3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static Long nextLong() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Long.parseLong(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		Long[] saws = new Long[Integer.parseInt(nextLong().toString())];
		Long[] wood = new Long[saws.length];

		for (int i = 0; i < saws.length; i++) {
			saws[i] = nextLong();
		}

		for (int i = 0; i < wood.length; i++) {
			wood[i] = nextLong();
		}

		Arrays.sort(saws);
		Arrays.sort(wood);

		long energy = 0;
		for (int i = 0; i < saws.length; i++) {
			energy += saws[i] * wood[wood.length-i-1];
		}
		System.out.println(energy);
	}
}