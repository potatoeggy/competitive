import java.util.Scanner;

public class mccc1s1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		int[] a1 = new int[n];
		int[] a2 = new int[n];
		
		for (int i = 0; i < n; i++) {
			a1[i] = input.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			a2[i] = input.nextInt();
		}
		
		int c = 0;
		boolean hasBattled = false;
		for (int i = 0; i < n; i++) {
			if (! hasBattled && a1[i] == a2[i]) {
				hasBattled = true;
				c++;
			} else if (a1[i] != a2[i]) {
				hasBattled = false;
			}
		}
		
		System.out.println(c);
	}
}
