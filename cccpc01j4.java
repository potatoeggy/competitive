import java.util.Scanner;

public class cccpc01j4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int bricks = input.nextInt();
		
		int[] array = new int[bricks];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		int counter = 0;
		int weAt = 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != weAt) {
				counter++;
			} else {
				weAt++;
			}
		}
		
		if (counter >= array.length) {
			System.out.println("-1");
		} else {
			System.out.println(counter);
		}
	}
}
