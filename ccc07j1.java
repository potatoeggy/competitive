import java.util.Scanner;
import java.util.Arrays;

class ccc07j1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[3];
		
		array[0] = input.nextInt();
		array[1] = input.nextInt();
		array[2] = input.nextInt();
		
		Arrays.sort(array);
		
		System.out.println(array[1]);
	}
}
