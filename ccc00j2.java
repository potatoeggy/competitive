import java.util.Scanner;

public class ccc00j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		
		String temp;
		String temp2;
		String temp3;
		int counter = 0;
		for (int i = x; i <= y; i++) {
			temp = Integer.toString(i);
			if (! (temp.contains("2") || temp.contains("3") || temp.contains("4") || temp.contains("5") || temp.contains("7"))) {
				temp2 = temp.replace("6", "2");
				temp3 = temp2.replace("9", "6");
				temp3 = temp3.replace("2", "9");
				if (new StringBuilder(temp).reverse().toString().equals(temp3)) {
					counter++;
				}
			}
		}
		System.out.println(counter);
		input.close();
	}
}
