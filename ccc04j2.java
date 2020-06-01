import java.util.Scanner;

class ccc04j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		int newYear = input.nextInt() - year;
		
		for (int i = 0; i <= newYear; i++) {
			if (i % 60 == 0) {
				System.out.println("All positions change in year " + (year + i));
			}
		}
	}
}
