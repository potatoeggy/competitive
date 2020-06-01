import java.util.Scanner;

class ccc14j3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int times = input.nextInt();
		
		int antonia = 100;
		int david = 100;
		
		int a, d;
		for (int i = 0; i < times; i++) {
			a = input.nextInt();
			d = input.nextInt();
			
			if (a > d) {
				david -= a;
			} else if (d > a) {
				antonia -= d;
			}
		}
		
		System.out.println(antonia);
		System.out.println(david);
	}
}
