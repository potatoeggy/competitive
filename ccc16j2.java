import java.util.Scanner;

class ccc16j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] ar1 = new int[4];
		int[] ar2 = new int[4];
		int[] ar3 = new int[4];
		int[] ar4 = new int[4];
		
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = input.nextInt();
		}
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = input.nextInt();
		}
		for (int i = 0; i < ar3.length; i++) {
			ar3[i] = input.nextInt();
		}
		for (int i = 0; i < ar4.length; i++) {
			ar4[i] = input.nextInt();
		}
		
		int tar1 = 0;
		int tar2 = 0;
		int tar3 = 0;
		int tar4 = 0;
		int tcl = 0;
		boolean magic = true;
		
		for (int i = 0; i < ar1.length; i++) {
			tar1 += ar1[i];
			tar2 += ar2[i];
			tar3 += ar3[i];
			tar4 += ar4[i];
		}
		
		for (int i = 0; i < ar1.length; i++) {
			tcl = ar1[i] + ar2[i] + ar3[i] + ar4[i];
			
			if (tcl != tar1) {
				magic = false;
			}
			tcl = 0;
		}
		
		if (tar1 != tar2 || tar2 != tar3 || tar3 != tar4) {
			magic = false;
		}
		
		if (magic) {
			System.out.println("magic");
		} else {
			System.out.println("not magic");
		}
	}
}
