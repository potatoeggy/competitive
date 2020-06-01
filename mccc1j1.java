import java.util.Scanner;

public class mccc1j1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[4];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		int min = array[0];
		int max = array[0];
		for (int num : array) {
			if (num < min) {
				min = num;
			} 
			if (num > max) {
				max = num;
			}
		}
		
		System.out.println(min);
		System.out.println(max);
	}
}
