import java.util.Scanner;

public class ship {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String user = input.nextLine();
		int c = 0;
		if (!user.contains("B")) {
			System.out.println("B");
			c++;
		}
		if (!user.contains("C")) {
			System.out.println("C");
			c++;
		}
		if (! user.contains("F")) {
			System.out.println("F");
			c++;
		}
		if (! user.contains("T")) {
			System.out.println("T");
			c++;
		}
		if (! user.contains("L")) {
			System.out.println("L");
			c++;
		}
		if (c == 0) {
			System.out.println("NO MISSING PARTS");
		}
	}
}
