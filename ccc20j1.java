import java.util.Scanner;

public class ccc20j1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		if (x + y * 2 + z * 3 >= 10) {
			System.out.println("happy");
		} else {
			System.out.println("sad");
		}
	}
}
