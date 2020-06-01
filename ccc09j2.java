import java.util.Scanner;

class ccc09j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int trout = input.nextInt();
		int pike = input.nextInt();
		int pickerel = input.nextInt();
		int total = input.nextInt();
		
		int counter = 0;
		for (int i = 0; i <= total; i++) {
			for (int j = 0; j <= total; j++) {
				for (int k = 0; k <= total; k++) {
					if (i == 0 && j == 0 && k == 0) {
					} else if (i * trout + j * pike + k * pickerel <= total) {
						System.out.println(i + " Brown Trout, " + j + " Northern Pike, " + k + " Yellow Pickerel");
						counter++;
					}
				}
			}
		}
		System.out.println("Number of ways to catch fish: " + counter);
	}
}
