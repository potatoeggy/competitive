import java.util.Scanner;

public class ccc19j3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int lines = input.nextInt();
		input.nextLine();
		int counter;
		String[] array = new String[lines];
		char[] charArray;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextLine();
		}
		
		for (int i = 0; i < array.length; i++) {
			counter = 1;
			charArray = array[i].toCharArray();
			for (int j = 1; j < charArray.length; j++) {
				if (charArray[j] == charArray[j - 1]) {
					counter++;
					if (j == charArray.length - 1) {
						System.out.println(counter + " " + charArray[j]);
					}
				} else if (j != charArray.length - 1) {
					System.out.print(counter + " " + charArray[j - 1] + " ");
					counter = 1;
				} else {
					System.out.print(counter + " " + charArray[j - 1] + " ");
					counter = 1;
					System.out.println(counter + " " + charArray[j]);
				}
			}
		}
	}
}
