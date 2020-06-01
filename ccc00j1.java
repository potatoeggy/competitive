import java.util.Scanner;

public class ccc00j1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int counter, totalDays;
		counter = input.nextInt() - 1;
		totalDays = input.nextInt();
		
		System.out.println("Sun Mon Tue Wed Thr Fri Sat");
		
		for (int i = 0; i < counter; i++) {
			System.out.print("    ");
		}
		
		for (int i = 1; i <= totalDays; i++) {
			System.out.print(String.format("%3d", i));
			if (counter == 6) {
				System.out.println();
				counter = 0;
			} else if (i != totalDays) {
				System.out.print(" ");
				counter++;
			} else {
				System.out.println();
			}
		}
	}
}
