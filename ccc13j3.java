import java.util.Scanner;
import java.util.Arrays;

class ccc13j3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int start = input.nextInt();
		char[] array;
		int counter = 0;
		
		boolean nobreak = true;
		
		while (nobreak) {
			start++;
			array = ("" + start).toCharArray();
			Arrays.sort(array);
			for (int j = 1; j < array.length; j++) {
				if (array[j - 1] == array[j]) {
					counter++;
				}
			}
			if (counter == 0) {
				System.out.println(start);
				nobreak = false;
			} else {
				counter = 0;
			}
		}
	}
}
