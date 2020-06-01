import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cco10p6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] alphabet = new char[26];
		char[] precomputed = new char[26];

		char underscore, preUnderscore;

		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = br.readLine().charAt(0);
		}

		underscore = br.readLine().charAt(0);

		int times = Integer.parseInt(br.readLine());
		for (int c = 0; c < precomputed.length; c++) {
			precomputed[c] = (char) (65 + c);
			for (int i = 0; i < times; i++) { // double for sucks, see if you can expedite this
				if (precomputed[c] == '_') {
					precomputed[c] = underscore;
				} else {
					precomputed[c] = alphabet[precomputed[c]-65];
				}
			}
		}

		preUnderscore = '_';
		for (int i = 0; i < times; i++) {
			if (preUnderscore == '_') {
				preUnderscore = underscore;
			} else {
				preUnderscore = alphabet[preUnderscore-65];
			}
		}

		char[] array = br.readLine().toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '_') {
				array[i] = preUnderscore;
			} else {
				array[i] = precomputed[array[i]-65];
			}
		}
		System.out.println(new String(array));
		br.close();
	}
}