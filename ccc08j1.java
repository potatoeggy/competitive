import java.util.Scanner;

class ccc08j1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double w = input.nextDouble();
		double h = input.nextDouble();
		
		double bmi = w / (h * h);
		if (bmi < 18.5) {
			System.out.println("Underweight");
		} else if (bmi > 25) {
			System.out.println("Overweight");
		} else {
			System.out.println("Normal weight");
		}
	}
}
