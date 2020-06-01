import java.util.Scanner;

public class ccc01j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		for (int i = 1; i < x; i += 2) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < 2 * (x - i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = x; i >= 1; i -= 2) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
				for (int j = 0; j < 2 * (x - i); j++) {
					System.out.print(" ");
				}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
