import java.util.Scanner;
import java.util.Arrays;

public class dmopc18c1p0 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[3];
		for (int i = 0; i < 3; i++) {
			array[i] = input.nextInt();
		}

		int[] clone = array.clone();
		Arrays.sort(clone);
		System.out.println(Arrays.equals(clone, array) ? "Good job!" : "Try again!");
	}
}
