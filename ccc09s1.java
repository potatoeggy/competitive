import java.util.Scanner;

public class ccc09s1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x = input.nextInt();
		int y = input.nextInt();
		input.close();

		boolean[] square = new boolean[y-x];
		boolean[] cube = new boolean[y-x];

		for (int i = (int)Math.sqrt(x); i * i <= y; i++) {
			// i don't think you can sieve
		}
	}
}