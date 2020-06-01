import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bf1hard {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Integer[] array = new Integer[Integer.parseInt(br.readLine())];

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}

		java.util.Arrays.sort(array);

		for (Integer num : array) {
			System.out.println(num);
		}
	}
}
