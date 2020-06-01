import java.util.Scanner;

public class boolean1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] user = input.nextLine().split(" ");
		boolean toggle = true;
		for (String string : user) {
			if (string.equals("True")) {
				break;
			} else {
				toggle = ! toggle;
			}
		}
		System.out.println(toggle ? "True" : "False");
	}
}
