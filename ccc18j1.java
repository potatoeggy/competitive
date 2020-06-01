import java.util.Scanner;

public class ccc18j1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		if (input.nextInt() >= 8) {
			counter++;
		}
		if (input.nextInt() == input.nextInt()) {
			counter++;
		}
		if (input.nextInt() >= 8) {
			counter++;
		}
		if (counter == 3) {
			System.out.println("ignore");
		} else {
			System.out.println("answer");
		}
	}
}
