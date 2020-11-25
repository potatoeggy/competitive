import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class bsspc20s1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	static int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	static HashMap<String, Integer> languageToLines = new HashMap<String, Integer>();
	public static void main(String[] args) throws IOException {
		languageToLines.put("Coffee", 3);
		languageToLines.put("--D", 0);
		languageToLines.put("Boa", 1);

		int times = nextInt(), requested = nextInt();
		ArrayList<Program> programs = new ArrayList<Program>();
		for (int i = 1; i <= times; i++) {
			int actualCode = nextInt(), comments = nextInt();
			String language = next();
			if (actualCode != 0 && !(actualCode > 200 && comments == 0)) programs.add(new Program(i, actualCode, comments, language));
		}

		if (programs.size() < requested) {
			System.out.println("Go to Seneca!");
		} else {
			Collections.sort(programs);
			for (int i = 0; i < requested; i++) System.out.println(programs.get(i).number);
		}
	}

	static class Program implements Comparable<Program> {
		int number, actualCode;
		int top, bottom;
		public Program(int number, int actualCode, int comments, String language) {
			this.number = number;
			this.actualCode = actualCode;
			this.bottom = 10 * (languageToLines.get(language) * comments + actualCode);
			this.top = Math.abs(bottom/10 - 10 * Math.max(languageToLines.get(language), 1) * comments);
		}

		public int compareTo(Program other) {
			int first = this.top * other.bottom;
			int second = other.top * this.bottom;
			if (first != second) return Integer.compare(first, second);
			else if (this.actualCode != other.actualCode) return Integer.compare(other.actualCode, this.actualCode);
			return Integer.compare(other.actualCode, this.actualCode);
		}
	}
}
