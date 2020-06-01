import java.util.Scanner;

public class vpex1p2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[input.nextInt()];
		
		int acc = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
			acc += array[i];
		}
		
		int count = 0;
		
		for (int num : array) {
			if (num != acc / array.length) {
				count++;
			}
		}
		System.out.println(count);
	}
}
