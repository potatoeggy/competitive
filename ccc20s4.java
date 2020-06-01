import java.util.Scanner;

public class ccc20s4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char[] user = input.nextLine().toCharArray();
		
		boolean sorted = false;
		int c = 0;
		for (int i = 0; ! sorted; i++) {
			sorted = true;
			for (int j = 1; j < user.length - i; j++) { // circle sort but i dunno how
				if (user[j - 1] > user[j]) { // we need to sort backwards and forwards
					char temp = user[j - 1];
					user[j - 1] = user[j];
					user[j] = temp;
					sorted = false;
				}
			}
			c++;
		}
		System.out.println(c);
	}
}
