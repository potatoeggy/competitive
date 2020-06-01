import java.util.Scanner;

public class validay15p2 {
	static int[] princesses;
	static int[] minutes;
	static int[][] best;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cages = sc.nextInt();
		int limit = sc.nextInt();
		princesses = new int[cages];
		minutes = new int[cages];
		best = new int[1001][1001];
		for (int i = 0; i < cages; i++) {
			princesses[i] = sc.nextInt();
			minutes[i] = sc.nextInt();
		}
		System.out.println(recursion(cages-1, limit, 0));
		sc.close();
	}

	static int recursion(int level, int capacity, int value) {
		if (capacity < 0) return -1;
		if (level < 0) return value;
		if (best[level][capacity] != 0) return best[level][capacity];
		if (capacity == 0) return value;
		best[level][capacity] = Math.max(recursion(level-1, capacity, value), recursion(level-1, capacity-minutes[level], value+princesses[level]));
		return best[level][capacity];
	}
}