import java.util.Scanner;

public class ccc02s2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int simp = 1;
		for (int i = y; i >= 2; i--) {
			if (x % i == 0 && y % i == 0) {
				simp = i;
				break;
			}
		}
		
		int divide = x / y;
		
		if (x % y == 0) {
			System.out.println(divide);
		} else if (divide > 1) {
			if (simp != 1) {
				System.out.println(divide + " " + (divide / simp) + "/" + y / simp);
			} else {
				System.out.println(divide + " " + x % y + "/" + y);
			}
		} else {
			if (simp != 1) {
				System.out.println(x / simp + "/" + y / simp);
			} else {
				System.out.println(x + "/" + y);
			}
		}
	}
}
