import java.util.Scanner;

class ccc06j1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] burgers = {461, 431, 420, 0};
		int[] sides = {100, 57, 70, 0};
		int[] drinks = {130, 160, 118, 0};
		int[] desserts = {167, 266, 75, 0};
		
		int calories = 0;
		calories += burgers[input.nextInt() - 1];
		calories += sides[input.nextInt() - 1];
		calories += drinks[input.nextInt() - 1];
		calories += desserts[input.nextInt() - 1];
		
		System.out.println("Your total Calorie count is " + calories + ".");
	}
}
