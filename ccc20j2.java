import java.util.Scanner;

public class ccc20j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int thresh = input.nextInt();
		int init = input.nextInt();
		int ea = input.nextInt();
		
		int total = init;
		int count = 0;
		while (total <= thresh) {
			init *= ea;
			total += init;
			count++;
		}
		System.out.println(count);
	}
}
