import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class ccc03s4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < times; i++) {
			String string = br.readLine().trim();
			int total = 1;
			for (int k = 1; k <= string.length(); k++) {
				TreeSet<String> list = new TreeSet<String>();
				for (int j = 0; j <= string.length()-k; j++) {
					String temp = string.substring(j, j + k);
					list.add(temp);
				}
				total += list.size();
			}
			System.out.println(total);
		}
	}
}
