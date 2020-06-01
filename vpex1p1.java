import java.util.Scanner;
import java.util.Arrays;

public class vpex1p1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] x = new int[5];
		int[] y = new int[5];
		
		for (int i = 0; i < x.length; i++) {
			x[i] = input.nextInt();
		}
		
		for (int i = 0; i < y.length; i++) {
			y[i] = input.nextInt();
		}
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		int tx = x[4] + x[1] + x[2] + x[3];
		int ty = y[4] + y[1] + y[2] + y[3];
		
		if (tx > ty) {
			System.out.println(tx);
		} else {
			System.out.println(ty);
		}
	}
}
