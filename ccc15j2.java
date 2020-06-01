import java.util.Scanner;

class ccc15j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char[] string = input.nextLine().toCharArray();
		
		int happy = 0;
		int sad = 0;
		
		for (int i = 0; i < string.length; i++) {
			if (string[i] == ':') {
				i++;
				if (string[i] == '-') {
					i++;
					if (string[i] == ')') {
						happy++;
					} else if (string[i] == '(') {
						sad++;
					}
				}
			}
		}
		
		if (happy > || sad > 0) {
			if (happy > sad) {
				System.out.println("happy");
			} else if (sad > happy) {
				System.out.println("sad");
			} else {
				System.out.println("unsure");
			}
		} else {
			System.out.println("none");
		}
	}
}
