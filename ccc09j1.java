import java.util.Scanner;

class ccc09j1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int thirteensum = 91;
		
		thirteensum += input.nextInt();
		thirteensum += input.nextInt() * 3;
		thirteensum += input.nextInt();
		
		System.out.println("The 1-3-sum is " + thirteensum);
	}
}
		
