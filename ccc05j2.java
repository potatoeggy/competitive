import java.util.Scanner;

class ccc05j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		
		int counter;
		int bigCounter = 0;
		
		for (int i = x; i <= y; i++) {
			counter = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					counter++;
				}
			}
			if (counter == 4) {
				bigCounter++;
			}
		}
		System.out.println("The number of RSA numbers between " + x + " and " + y + " is " + bigCounter);
	}
}
