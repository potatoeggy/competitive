import java.util.Scanner;
import java.util.Arrays;

public class anothersorting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[input.nextInt()];

		for (int i = 0; i < array.length; i++) {
			int user = input.nextInt();
			while (user >= 10) {
				user %= 10;
			}

			array[i] = user;
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array).replace("]", "").replace("[","").replace(",", "")); // fuge we return original values
	}
}
