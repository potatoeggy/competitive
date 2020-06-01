import java.util.Scanner;
import java.util.Arrays;

class ccc13j4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int minutes = input.nextInt();
		
		int times = input.nextInt();
		
		int[] array = new int[times];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		Arrays.sort(array);
		
		int counter = 0;
		int accumulator = 0;
		for (int i = 0; i < array.length; i++) {
			if (accumulator + array[i] <= minutes) {
				accumulator += array[i];
				counter++;
			}
		}
		System.out.println(counter);
	}
}
