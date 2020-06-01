import java.util.Scanner;

class ccc00j3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quarters = input.nextInt();
		int m1 = input.nextInt(); // 30 every 35
		int m2 = input.nextInt(); // 60 every 100
		int m3 = input.nextInt(); // 9 every 10
		
		int acc = 0;
		int machine = 1;
		while (quarters != 0) {
			quarters--;
			if (machine == 1) {
				m1++;
				if (m1 == 35) {
					quarters += 30;
					m1 = 0;
				}
			} else if (machine == 2) {
				m2++;
				if (m2 == 100) {
					quarters += 60;
					m2 = 0;
				}
			} else if (machine == 3) {
				m3++;
				if (m3 == 10) {
					quarters += 9;
					m3 = 0;
				}
				machine = 0;
			}
			machine++;
			acc++;
		}
		
		System.out.println("Martha plays " + acc + " times before going broke.");
		input.close();
	}
}
