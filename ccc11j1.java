import java.util.Scanner;

class ccc11j1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		if (x >= 3 && y <= 4) {
			System.out.println("TroyMartian");
		}
		if (x <= 6 && y >= 2) {
			System.out.println("VladSaturnian");
		}
		if (x <= 2 && y <= 3) {
			System.out.println("GraemeMercurian");
		}
	}
}
