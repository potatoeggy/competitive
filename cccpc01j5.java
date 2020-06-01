import java.util.Scanner;

public class cccpc01j5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		long user = input.nextLong();
		
		if (user % 2 == 0) {
			long ans=0;
			for (long i=5; user / i >=1; i*=5L) {
				ans += user / (2L*i);
			}
			System.out.println(ans);
		} else {
			System.out.println("0");
		}
	}
}
