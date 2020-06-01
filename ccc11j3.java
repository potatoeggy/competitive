import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ccc11j3 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int x = Integer.parseInt(br.readLine().trim());
		int y = Integer.parseInt(br.readLine().trim());

		int c = 2;
		int temp;
		while (x >= y && y >= 0) {
			temp = y;
			y = x - y;
			x = temp;
			c++;
		}
		System.out.println(c);
	}
}
