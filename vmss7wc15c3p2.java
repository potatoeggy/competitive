import java.util.Scanner;
import java.util.Arrays;

public class vmss7wc15c3p2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[input.nextInt()];
		int ttl = input.nextInt();

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		Arrays.sort(array);

		int acc = 0;
		for (int i = array.length-1; i >= array.length-ttl; i--) {
			if (array[i] > 0) acc += array[i];
		}
		System.out.println(acc);
	}
}
