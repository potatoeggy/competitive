import java.util.Scanner;

public class ccc03j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[65000];
		
		for (int i = 0; true; i++) {
			array[i] = input.nextInt();
			if (array[i] == 0) {
				break;
			}
		}
		
		double root;
		for (int user : array) {
			if (user != 0) {
				root = Math.sqrt(user);
				if ((int) root == root) {
					System.out.println("Minimum perimeter is " + 4 * (int) root + " with dimensions " + (int) root + " x " + (int)root);
				} else {
					int upRoot = (int) Math.ceil(root) + 1; // not how multiplication works
					int downRoot = (int) Math.ceil(root) - 1;
					System.out.println("Minimum perimeter is " + (2 * upRoot + 2 * downRoot) + " with dimensions " + upRoot + " x " + downRoot);
				}
			} else {
				break;
			}
		}
	}
}
