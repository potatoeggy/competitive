import java.util.Scanner;
import java.lang.StringBuilder;

public class ccc16j3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String notArray = input.nextLine();
		
		int highest = 0;
		for (int i = 0; i < notArray.length() + 1; i++) {
			for (int j = i; j < notArray.length() + 1; j++) {
				if (notArray.substring(i, j).equals(new StringBuilder(notArray.substring(i, j)).reverse().toString())) {
					if (notArray.substring(i, j).length() > highest) {
						highest = notArray.substring(i, j).length();
					}
				}
			}
		}
		System.out.println(highest);
	}
}
