import java.util.Scanner;

class ccc16j1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int win = 0;
		int loss = 0;
		
		for (int i = 0; i < 6; i++) {
			if (input.nextLine().equals("L")) {
				loss++;
			} else {
				win++;
			}
		}
		
		if (win >= 5) {
			System.out.println("1");
		} else if (win >= 3) {
			System.out.println("2");
		} else if (win >= 1) {
			System.out.println("3");
		} else {
			System.out.println("-1");
		}
	}
}
