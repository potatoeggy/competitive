import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc13s2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.parseInt(br.readLine());
		int[] array = new int[Integer.parseInt(br.readLine())];

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}

		int cars = 0;

		int acc = 0;
		for (int i = 0; i < array.length; i++) {
			acc += array[i];
			if (acc <= max) cars++;
		}
		
		for (int i = 3; i < array.length; i++) {
			if (array[i-3] + array[i-2] + array[i-1] + array[i] <= max) {
				if (i == 3) {
					cars = 4;
				} else {
					cars++;
				}
			} else {
				break;
			}
		}
		System.out.println(cars);
	}
}
