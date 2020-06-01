import java.util.Scanner;

class ccc07j3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] boxes = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
		
		int vals = input.nextInt();
		
		int money = 0;
		
		for (int i = 0; i < vals; i++) {
			int temp = input.nextInt() - 1;
			money += boxes[temp];
			boxes[temp] = 0;
		}
		
		int banker = input.nextInt();
		
		int accumulator = 0;
		int counter = 0;
		for (int i = 0; i < boxes.length; i++) {
			if (boxes[i] != 0) {
				counter++;
				accumulator += boxes[i];
			}
		}
		
		if (accumulator / counter < banker) {
			System.out.println("deal");
		} else {
			System.out.println("no deal");
		}
	}
}
