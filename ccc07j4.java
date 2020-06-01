import java.util.Scanner;
import java.util.Arrays;

class ccc07j4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String x = input.nextLine();
		x = x.replace(" ", "");
		String y = input.nextLine();
		y = y.replace(" ", "");
		
		char[] cX = x.toCharArray();
		char[] cY = y.toCharArray();
		
		Arrays.sort(cX);
		Arrays.sort(cY);
		
		if (Arrays.equals(cX, cY)) {
			System.out.println("Is an anagram.");
		} else {
			System.out.println("Is not an anagram.");
		}
	}
}
