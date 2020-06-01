import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stnbd1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int times = Integer.parseInt(br.readLine());

		int ren = Integer.parseInt(br.readLine());
		boolean overNineThousand = false;
		for (int i = 1; i < times; i++) {
			if (Integer.parseInt(br.readLine()) >= ren) {
				overNineThousand = true;
				break;
			}
		}
		System.out.println(overNineThousand ? "NO" : "YES");
	}
}