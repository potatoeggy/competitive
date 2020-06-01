import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class odd {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(br.readLine());

		int holder = 0;
		for (int i = 0; i < times; i++) {
			holder ^= Integer.parseInt(br.readLine());
		}
		System.out.println(holder);
	}
}
