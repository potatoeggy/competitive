import java.util.Scanner;

class ccc04j3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		
		String[] xArray = new String[x];
		String[] yArray = new String[y];
		
		input.nextLine();
		
		for (int i = 0; i < x; i++) {
			xArray[i] = input.nextLine();
		}
		
		for (int i = 0; i < y; i++) {
			yArray[i] = input.nextLine();
		}
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.println(xArray[i] + " as " + yArray[j]);
			}
		}
	}
}
