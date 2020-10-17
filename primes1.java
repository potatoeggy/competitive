import java.math.BigInteger;
import java.util.Scanner;

public class primes1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for (int times = 0, i = 1; times < num; i++) {
			if (new BigInteger(i + "").isProbablePrime(5)) {
				System.out.println(i);
				times++;
			}
		}
		in.close();
	}
}