import java.util.Scanner;

class ccc05j1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dMin = input.nextInt();
		int eMin = input.nextInt();
		int wMin = input.nextInt();
		
		double aCost = 0;
		double bCost = 0;
		
		if (dMin > 100) {
			aCost += (dMin - 100) * 0.25;
		}
		aCost += eMin * 0.15;
		aCost += wMin * 0.20;
		
		if (dMin > 250) {
			bCost += (dMin - 250) * 0.45;
		}
		bCost += eMin * 0.35;
		bCost += wMin * 0.25;
		
		aCost = (double) Math.round(aCost * 100) / 100;
		bCost = (double) Math.round(bCost * 100) / 100;
		
		System.out.println("Plan A costs " + aCost);
		System.out.println("Plan B costs " + bCost);
		
		if (aCost < bCost) {
			System.out.println("Plan A is cheapest.");
		} else if (bCost < aCost) {
			System.out.println("Plan B is cheapest.");
		} else {
			System.out.println("Plan A and B are the same price.");
		}
	}
}
