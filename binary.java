import java.util.Scanner;
import java.lang.StringBuilder;

public class binary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int times = input.nextInt();
		for (int i = 0; i < times; i++) {
			int temp = input.nextInt();
			String tempString = Integer.toBinaryString(temp);
			int modifier = tempString.length() % 4 == 0 ? 4 : tempString.length() % 4;
			String binaryString = String.format("%" + (tempString.length() + (4 - modifier)) + "s", tempString).replace(" ", "0");
			StringBuilder sb = new StringBuilder(binaryString);
			for (int j = sb.length() - 4; j > 0; j -= 4) {
				sb.insert(j, ' ');
			}
			binaryString = sb.toString();
			System.out.println(binaryString);
		}
	}
}
