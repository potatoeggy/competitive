import java.util.Scanner;

class ccc12j1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int limit = input.nextInt();
		int speed = input.nextInt();
		
		if (speed <= limit) {
			System.out.println("Congratulations, you are within the speed limit!");
		} else if (speed - limit <= 20) {
			System.out.println("You are speeding and your fine is $100.");
		} else if (speed - limit <= 30) {
			System.out.println("You are speeding and your fine is $270.");
		} else {
			System.out.println("You are speeding and your fine is $500.");
		}
	}
}
