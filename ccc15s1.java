import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class ccc15s1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());

		List<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < x; i++) {
			int temp = Integer.parseInt(br.readLine());
			if (temp == 0) {
				array.remove(array.size() - 1);
			} else {
				array.add(temp);
			}
		}

		int acc = 0;
		for (int num : array) {
			acc += num;
		}
		System.out.println(acc);
	}
}
