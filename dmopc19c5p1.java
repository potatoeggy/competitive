import java.util.Scanner;
import java.util.Arrays;

public class dmopc19c5p1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int has = input.nextInt();
		int queries = input.nextInt();
		input.nextLine();

		String[] inventory = new String[has];

		for (int i = 0; i < inventory.length; i++) {
			inventory[i] = input.nextLine();
		}

		int completable = 0;
		
		for (int i = 0; i < queries; i++) {
			int requires = input.nextInt();
			input.nextLine();
			boolean failed = false;
			for (int j = 0; j < requires; j++) {
				String temp = input.nextLine();
				if (! Arrays.asList(inventory).contains(temp)) {
					failed = true;
				}
			}
			if (! failed) {
				completable++;
			}
		}
		System.out.println(completable);
	}
}
