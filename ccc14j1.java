import java.util.Scanner;

class ccc14j1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		int decider = 0;
		
		if (x + y + z == 180) {
			if (x == y) {
				decider++;
			}
			if (y == z) {
				decider++;
			} 
			if (x == z) {
				decider++;
			}
			switch (decider) {
				case 0:
					System.out.println("Scalene");
					break;
				case 1:
					System.out.println("Isosceles");
					break;
				case 3:
					System.out.println("Equilateral");
			}
		} else {
			System.out.println("Error");
		}
	}
}
		
