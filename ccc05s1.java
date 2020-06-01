import java.util.Scanner;

public class ccc05s1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		input.nextLine();
		
		for (int i = 0; i < x; i++) {
			char[] array = input.nextLine().replace(" ", "").toCharArray();
			
			for (int j = 0; j < 10; j++) {
				if (j == 3 || == 
				} else if (array[i] >= 65 && array[i] <= 67) {
					System.out.print('A');
				} else {
					System.out.print(array[i]);
				}
