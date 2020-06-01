import java.util.Scanner;

class ccc11j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int h = input.nextInt();
		int M = input.nextInt();
		
		int ground = -1;
		for (int i = 1; i <= M; i++) {
			if (-6*i*i*i*i + h * i*i*i + 2 * i*i + i <= 0) {
				ground = i;
				break;
			}
		}
		
		if (ground != -1) {
			System.out.println("The balloon first touches ground at hour:");
			System.out.println(ground);
		} else {
			System.out.println("The balloon does not touch ground in the given time.");
		}
	}
}
