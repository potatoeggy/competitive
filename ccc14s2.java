import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class ccc14s2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		input.nextLine();
		
		String[] reference = input.nextLine().split(" ");
		String[] compare = input.nextLine().split(" ");
		
		boolean failed = false;
		int referToCompare;
		for (int i = 0; i < reference.length; i++) {
			for (int j = 0; j < compare.length; j++) {
				if (reference[i].equals(compare[j])) {
					if (! compare[i].equals(reference[j]) || reference[i].equals(compare[i])) {
						failed = true;
						break;
					}
				}
			}
		}
		if (failed) {
			System.out.println("bad");
		} else {
			System.out.println("good");
		}
	}
}
