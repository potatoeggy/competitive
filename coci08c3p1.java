import java.util.Scanner;

public class coci08c3p1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int max = 0;
		int maxInd = 0;

		for (int i = 0; i < 5; i++) {
			int local = 0;
			for (int j = 0; j < 4; j++) {
				local += input.nextInt();
			}
			if (local > max) {
				max = local;
				maxInd = i + 1;
			}
		}
		input.close();

		System.out.println(maxInd + " " + max);
	}
}