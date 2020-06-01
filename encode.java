import java.util.Scanner;

public class encode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int shift = input.nextInt();

		input.nextLine();
		char[] encoded = input.nextLine().toCharArray();

		for (int i = 0 // never mind
