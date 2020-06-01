import java.util.Scanner;

class ccc17j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int times = input.nextInt();
		int sum = 0;
		for (int i = 0; i <= times; i++) {
			sum += num * Math.pow(10, i);
		}
		System.out.println(sum);
	}
}
// broken for now
