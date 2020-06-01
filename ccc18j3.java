import java.util.Scanner;

public class ccc18j3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[5];
		for (int i = 1; i < array.length; i++) {
			array[i] = input.nextInt() + array[i-1];
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(Math.abs(array[j]-array[i]) + " ");
			}
			System.out.println();
		}

		input.close();
	}
}
