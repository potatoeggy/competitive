import java.util.Scanner;

public class mccc18s1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();
		int p = input.nextInt();
		int x = input.nextInt();
		// i can't solve this i can't even do this algebraically or mentally
		
		for (int m = 1; true; m++) {
			if (m * x + k * p / (double) m >= 2 * Math.sqrt(x * p * m)) {
				System.out.println(m * x + k * p / (double) m);
				break;
			}
		}
	}
}
