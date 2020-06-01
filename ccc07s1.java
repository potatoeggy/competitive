import java.util.Scanner;

public class ccc07s1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int[][] array = new int[x][3];
		for (int[] list : array) {
			for (int i = 0; i < list.length; i++) {
				list[i] = input.nextInt();
			}
		}
		
		for (int[] list : array) {
			if (list[0] < 1989) {
				System.out.println("Yes");
			} else if (list[0] == 1989) {
				if (list[1] < 2) {
					System.out.println("Yes");
				} else if (list[1] == 2) {
					if (list[2] <= 27) {
						System.out.println("Yes");
					} else {
						System.out.println("No");
					}
				} else {
					System.out.println("No");
				}
			} else {
				System.out.println("No");
			}
		}
	}
}
