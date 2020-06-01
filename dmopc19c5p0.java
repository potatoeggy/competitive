import java.util.Scanner;

public class dmopc19c5p0 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int times = input.nextInt();
		int passing = input.nextInt();
		input.nextLine();
		
		for (int i = 0; i < times; i++) {
			String temp = input.next();
			int marks = input.nextInt();

			System.out.println(temp + " will " + (marks > passing ? "advance" : "not advance"));
		}
	}
}
