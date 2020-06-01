import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dmopc18c5p3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static long nextLong() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Long.parseLong(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		long[] times = new long[Integer.parseInt(""+(nextLong()+1))];
		long limit = nextLong();

		for (int i = 1; i < times.length; i++) {
			times[i] = nextLong() + times[i-1];
		}

		int left = 1;
		int max = 0;
		for (int i = 1; i < times.length; i++) {
			if (times[i]-times[left] >= limit) {
				if (i-left-1 > max && times[i-1]-times[left] < limit) {
					max = i-left-1;
				}
				left++;
				i--;
			}
		}

		System.out.println(times.length > 2 ? max : times[1]);
	}
}