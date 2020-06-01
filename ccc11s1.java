import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc11s1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		int ss = 0;
		int ts = 0;
		
		for (int i = 0; i < x; i++) {
			String temp = br.readLine().toLowerCase();
			ts += temp.length() - temp.replace("t", "").length();
			ss += temp.length() - temp.replace("s", "").length();
		}

		System.out.println(ts > ss ? "English" : "French");
	}
}
