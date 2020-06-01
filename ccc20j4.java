import java.util.Scanner;
import java.lang.StringBuilder;

public class ccc20j4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine();
		String check = input.nextLine();
		
		boolean found = false;
		for (int i = 0; i < check.length(); i++) {
			if (text.contains(check.substring(i, i + 1) + check.substring(i + 1) + check.substring(0, i))) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
}
