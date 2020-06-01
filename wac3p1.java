import java.util.Scanner;

public class wac3p1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] input = in.nextLine().split(" ");
		int t = Integer.parseInt(input[0]);
		int d = Integer.parseInt(input[1]);
		int p = Integer.parseInt(input[2]);
		
		int counter = 0;
		if (t < -40) {
			counter++;
		}
		
		if (d >= 15) {
			counter++;
		}
		
		if (p > 50) {
			counter++;
		}
		
		if (counter >= 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
