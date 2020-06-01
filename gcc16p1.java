import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class gcc16p1 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int hours = nextInt();
		int[] streaming = new int[nextInt()*2];
		int wQuery = nextInt();

		for (int i = 0; i < streaming.length; i++) {
			streaming[i] = nextInt();
		}
		
		for (int i = 0; i < wQuery; i++) {

		}
	}
}