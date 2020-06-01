import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc17s1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}
	
	public static void main(String[] args) throws IOException {
		int x = nextInt();
		int[] swift = new int[x];
		int[] sema = new int[x];

		int swiftAcc = 0;
		int semaAcc = 0;
		
		for (int i = 0; i < x; i++) {
			swift[i] = nextInt();
		}

		int max = 0;
		
		for (int i = 0; i < x; i++) {
			sema[i] = nextInt();
			swiftAcc += swift[i];
			semaAcc += sema[i];

			if (swiftAcc == semaAcc) {
				max = i + 1;
			}
		}

		System.out.println(max);
	}
}
