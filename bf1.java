import java.util.Scanner;

public class bf1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[input.nextInt()];

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		java.util.Arrays.sort(array);
		for (int num : array) {
			System.out.println(num);
		}
	}
}
