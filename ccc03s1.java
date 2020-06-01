import java.util.Scanner;

public class ccc03s1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int square = 1;
		int user;
		
		while (true) {
			user = input.nextInt();
			if (user == 0) {
				System.out.println("You Quit!");
				break;
			} else {
				if (square + user <= 100) {
					square += user;
					if (square == 54) {
						square = 19;
					} else if (square == 90) {
						square = 48;
					} else if (square == 99) {
						square = 77;
					} else if (square == 9) {
						square = 34;
					} else if (square == 40) {
						square = 64;
					} else if (square == 67) {
						square = 86;
					}
				}
			}
			
			System.out.println("You are now on square " + square);
			
			if (square == 100) {
				System.out.println("You Win!");
				break;
			}
		}
	}
}
