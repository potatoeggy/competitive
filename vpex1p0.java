import java.util.Scanner;

public class vpex1p0 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		
		System.out.print(x / y);
		System.out.print(" " + (x % y));
	}
}
