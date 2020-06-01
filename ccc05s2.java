import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ccc05s2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static int nextInt() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return Integer.parseInt(st.nextToken());
	}

	public static void main(String[] args) throws IOException {
		int maxx = nextInt();
		int maxy = nextInt();

		int inx = nextInt();
		int iny = nextInt();

		int x = 0;
		int y = 0;

		while (inx != 0 || iny != 0) {
			x += inx;
			y += iny;
			if (x < 0) x = 0;
			if (y < 0) y = 0;
			if (x > maxx) x = maxx;
			if (y > maxy) y = maxy;
			System.out.println(x + " " + y);
			
			inx = nextInt();
			iny = nextInt();
		}
	}
}