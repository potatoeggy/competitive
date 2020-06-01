import java.util.Scanner;

class ccc06j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		int counter = 0;
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				if (i + j == 10) {
					counter++;
				}
			}
		}
		
		if (counter == 1) {
			System.out.println("There is 1 way to get the sum 10.");
		} else {
			System.out.println("There are " + counter + " ways to get the sum 10.");
		}
	}
}
