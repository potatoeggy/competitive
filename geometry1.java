import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class geometry1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int times = nextInt();

		for (int i = 0; i < times; i++) {
			double[] px = new double[3];
			double[] py = new double[3];
			for (int j = 0; j < 3; j++) {
				px[j] = nextInt();
				py[j] = nextInt();
			}

			double s1 = Math.sqrt((Math.pow(px[1] - px[0], 2) + Math.pow(py[1] - py[0], 2)));
			double s2 = Math.sqrt((Math.pow(px[2] - px[0], 2) + Math.pow(py[2] - py[0], 2)));
			double s3 = Math.sqrt((Math.pow(px[2] - px[1], 2) + Math.pow(py[2] - py[1], 2)));
			double pf = s1 + s2 + s3;
			double p = pf / 2;
			System.out.printf("%.2f", Math.sqrt(p * (p-s1) * (p-s2) * (p-s3)));
			System.out.println(" " + String.format("%.2f", pf));
		}
	}
}