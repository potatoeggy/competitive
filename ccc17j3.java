import java.util.Scanner;

class ccc17j3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		
		int b = input.nextInt();
		
		int travel = Math.abs(x2 - x1) + Math.abs(y2 - y1);
		
		if (b >= travel) {
			if (b % 2 != travel % 2) {
				System.out.println("N");
			} else {
				System.out.println("Y");
			}
		} else {
			System.out.println("N");
		}
	}
}
		
