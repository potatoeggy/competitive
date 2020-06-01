import java.util.Scanner;

public class mccc1j3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		System.out.println(String.format("%.2f", (x * y / 4.0)));
	}
}
