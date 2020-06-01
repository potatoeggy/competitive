import java.util.Scanner;
import java.math.BigInteger;

public class ccc01j2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		BigInteger x = new BigInteger(in.nextLine());
		BigInteger y = new BigInteger(in.nextLine());
		try {
			System.out.println(x.modInverse(y));
		} catch (Exception e) {
			System.out.println("No such integer exists.");
		}
	}
}
