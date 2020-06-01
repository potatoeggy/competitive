import java.util.Scanner;

public class ccc12j3 {
	static int size;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			loopedPrint('*');
			loopedPrint('x');
			loopedPrint('*');
			System.out.println();
		}

		for (int i = 0; i < size; i++) {
			loopedPrint(' ');
			loopedPrint('x');
			loopedPrint('x');
			System.out.println();
		}

		for (int i = 0; i < size; i++) {
			loopedPrint('*');
			loopedPrint(' ');
			loopedPrint('*');
			System.out.println();
		}
		sc.close();
	}

	static void loopedPrint(char c) {
		for (int i = 0; i < size; i++) {
			System.out.print(c);
		}
	}
}