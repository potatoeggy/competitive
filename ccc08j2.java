import java.util.Scanner;

class ccc08j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// make an array with one extra empty slot on each side
		String[] array = {"", "A", "B", "C", "D", "E", ""};
		int b = 0;
		int n = 0;
		
		while (b != 4) {
			b = input.nextInt();
			n = input.nextInt();
			for (int i = 0; i < n; i++) {
				if (b == 1) {
					for (int j = 1; j <= 5; j++) {
						array[j - 1] = array[j];
					}
					array[5] = array[0];
				} else if (b == 2) {
					for (int j = 6; j >= 1; j--) {
						array[j] = array[j - 1];
					}
					array[1] = array[6];
				} else if (b == 3) {
					String temp = array[1];
					array[1] = array[2];
					array[2] = temp;
				}
			}
		}
		for (int i = 1; i <= 5; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
