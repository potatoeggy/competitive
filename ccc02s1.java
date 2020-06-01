import java.util.Scanner;

public class ccc02s1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[4];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		int price = input.nextInt();
		
		int counter = 0;
		int min = 100000000;
		
		for (int i = 0; i <= price; i++) {
			for (int j = 0; j <= price; j++) {
				for (int k = 0; k <= price; k++) {
					for (int l = 0; l <= price; l++) {
						if (array[0] * i + array[1] * j + array[2] * k + array[3] * l == price) {
							System.out.println("# of PINK is " + i + " # of GREEN is " + j + " # of RED is " + k + " # of ORANGE is " + l);
							counter++;
							if (i + k + l + j < min) {
								min = i + k + l + j;
							}
						}
					}
				}
			}
		}
		
		System.out.println("Total combinations is " + counter + ".");
		System.out.println("Minimum number of tickets to print is " + min + ".");
	}
}
