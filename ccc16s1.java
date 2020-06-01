import java.util.Scanner;
import java.util.Arrays;

public class ccc16s1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char[] x = input.nextLine().toCharArray();
		char[] y = input.nextLine().toCharArray();
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (x[i] == y[j]) {
					x[i] = '1';
					y[j] = '1';
					break;
				}
			}
		}
		
		if (String.valueOf(y).replace("*", "").replace("1", "").length() > 0) {
			System.out.println("N");
		} else {
			System.out.println("A");
		}
	}
}
