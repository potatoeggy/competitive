import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hkccc08j3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || ! st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public static void main(String[] args) throws IOException {
		String[] names = new String[nextInt()];
		int[] numbers = new int[names.length];

		for (int i = 0; i < names.length; i++) {
			names[i] = next();
			numbers[i] = nextInt();
		}
		
		int[] queries = new int[names.length];

		int times = nextInt();
		for (int i = 0; i < times; i++) {
			int temp = nextInt();
			for (int j = 0; j < names.length; j++) {
				if (numbers[j] == temp) {
					queries[j]++;
					break;
				}
			}
		}

		int biggest = 0;
		int biggestNum = 0;
		int biggestInd = 0;
		for (int i = 0; i < names.length; i++) {
			if (queries[i] > biggest) {
				biggest = queries[i];
				biggestNum = numbers[i];
				biggestInd = i;
			} else if (queries[i] == biggest) {
				if (biggestNum > numbers[i]) {
					biggest = queries[i];
					biggestNum = numbers[i];
					biggestInd = i;
				}
			}
		}

		System.out.println(names[biggestInd]);
	}
}
