import java.util.Scanner;

public class ccc19j1 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b;
		a = input.nextInt() * 3 + input.nextInt() * 2 + input.nextInt();
		b = input.nextInt() * 3 + input.nextInt() * 2 + input.nextInt();
		
		if (a > b) {
			System.out.println("A");
		} else if (a == b) {
			System.out.println("T");
		} else {
			System.out.println("B");
		}
	}
}
