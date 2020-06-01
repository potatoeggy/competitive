import java.util.Scanner;

public class mccc1j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int many = input.nextInt();
		
		int ttl;
		if (x > y) {
			ttl = x * many;
		} else {
			ttl = y * many;
		}
		System.out.println(ttl);
	}
}
