import java.util.Scanner;

public class ccc18j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		input.nextLine();
		char[] array1 = input.nextLine().toCharArray();
		char[] array2 = input.nextLine().toCharArray();
		
		int counter = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == array2[i] && array1[i] == 'C') {
				counter++;
			}
		}
		
		System.out.println(counter);
	}
}
