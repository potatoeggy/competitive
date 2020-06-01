import java.util.Scanner;

public class ccc02j1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt(); // no leading whitespace so have case for newline
		
		switch (x) {
			case 0:
			case 2:
			case 3:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println(" * * *");
				break;
			default:
				System.out.println("      ");
		}
		
		switch (x) {
			case 0:
			case 4:
			case 5:
			case 6:
			case 8:
			case 9:
				System.out.print("*    ");
				break;
			default:
				System.out.print("     ");
		}
		
		switch (x) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 7:
			case 8:
			case 9:
				System.out.println("*");
				break;
			default:
				System.out.print
	}
}
