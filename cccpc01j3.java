import java.util.Scanner;

public class cccpc01j3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		long temp = x;
		
		while (true) {
			if (temp % y == 0) {
				System.out.println(temp);
				break;
			} else {
				temp += x;
			}
		}
	}
}
