import java.util.Scanner;

public class ccc20j3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int times = input.nextInt();
		input.nextLine();
		
		int minx = Integer.MAX_VALUE;
		int maxx = 0;
		int miny = Integer.MAX_VALUE;
		int maxy = 0;
		String[] why;
		
		for (int i = 0; i < times; i++) {
			why = input.nextLine().split(",");
			int tempx = Integer.parseInt(why[0]);
			int tempy = Integer.parseInt(why[1]);
			if (tempx < minx) {
				minx = tempx;
			}
			if (tempx > maxx) {
				maxx = tempx;
			}
			
			if (tempy < miny) {
				miny = tempy;
			}
			if (tempy > maxy) {
				maxy = tempy;
			}
		}
		System.out.println((minx - 1) + "," + (miny - 1));
		System.out.println((maxx + 1) + "," + (maxy + 1));
	}
}
