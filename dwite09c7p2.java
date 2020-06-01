import java.util.Scanner;

public class dwite09c7p2 {
	public static void main(String[] args) {
		boolean[] primes = new boolean[100001];
		int[] array = new int[100001];
		primes[1] = true;
		for (int i = 2; i < primes.length; i++) {
			if (! primes[i]) {
				for (int j = Math.abs(i * i); j <= 100000; j += i) {
					primes[j] = true;
				}
				array[i] = array[i-1] + i;
			} else {
				array[i] = array[i-1];
			}
		}
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println(array[input.nextInt()]);
		}
	}
}
