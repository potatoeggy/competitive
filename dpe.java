import java.util.Scanner;

public class dpe {
	public static void main(String[] args) { // they're smarter than that and banned this :(
		Scanner sc = new Scanner(System.in);
		int cages = sc.nextInt();
		int limit = sc.nextInt();
		long[] best = new long[limit+1];

		for (int i = 1; i <= cages; i++) {
			int weight = sc.nextInt();
			int value = sc.nextInt();
			for (int j = limit; j >= 0; j--) {
				if (weight <= j) {
					best[j] = Math.max(best[j], best[j-weight] + value);
				}
			}
		}
		sc.close();
		System.out.println(best[limit]);
	}
}