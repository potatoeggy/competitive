import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc11s4 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int[] blood = new int[8];
		int[] people = new int[8];

		int cured = 0;

		while (blood[0] > 0) {
			boolean found = false;
			if (people[0] > 0) {
				people[0]--;
				found = true;
			} else if (people[1] > 0) {
				people[1]--;
				found = true;
			} else if (people[])
			
			if (found) {
				blood[0]--;
				cured++;
			} else {
				break;
			}
		}
		// aw this is a pain, be sure to restart
	}
}
// O-, O+, A-, A+, B-, B+, AB-, AB+
// 0   1   2   3   4   5   6    7