import java.util.Scanner;

class ccc12j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		int a = input.nextInt();
		
		if (x < y && y < z && z < a) {
			System.out.println("Fish Rising");
		} else if (a < z && z < y && y < x) {
			System.out.println("Fish Diving");
		} else if (x == y && y == z && z == a) {
			System.out.println("Fish At Constant Depth");
		} else {
			System.out.println("No Fish");
		}
	}
}
