import java.util.Scanner;

class ccc10j1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int daddy = input.nextInt();
		
		int counter = 0;
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				if (i + j == daddy && i >= j) {
					counter++;
				}
			}
		}
		System.out.println(counter);
	}
}
