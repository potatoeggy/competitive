import java.util.Scanner;
import java.util.Arrays;

public class ccc16s2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int prob = input.nextInt();
		int n = input.nextInt();
		
		int[] dmoj = new int[n];
		int[] peg = new int[n];
		
		for (int i = 0; i < dmoj.length; i++) {
			dmoj[i] = input.nextInt();
		}
		
		for (int i = 0; i < peg.length; i++) {
			peg[i] = input.nextInt();
		}
		
		Arrays.sort(dmoj);
		Arrays.sort(peg);
		
		int min = 0;
		int max = 0;
		
		int j = peg.length - 1;
		if (prob == 2) {
			for (int i = 0; i < dmoj.length; i++) {
				if (dmoj[i] > peg[j]) {
					max += dmoj[i];
				} else {
					max += peg[j];
				}			
				j--;
			}
			System.out.println(max);
		} else {
			for (int i = 0; i < dmoj.length; i++) {
				if (dmoj[i] > peg[i]) {
					min += dmoj[i];
				} else {
					min += peg[i];
				}
			}
			System.out.println(min);
		}
	}
}
