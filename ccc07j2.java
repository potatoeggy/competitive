import java.util.Scanner;

class ccc07j2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String user = "";
		String[] terms = {"CU", ":-)", ":-(", ";-)", ":-P", "(~.~)", "TA", "CCC", "CUZ", "TY", "YW", "TTYL"};
		String[] translations = {"see you", "I'm happy", "I'm unhappy", "wink", "stick out my tongue", "sleepy", "totally awesome", "Canadian Computing Competition", "because", "thank-you", "you're welcome", "talk to you later"};
		
		while (! user.equals("TTYL")) {
			user = input.nextLine();
			for (int i = 0; i < terms.length; i++) {
				if (user.equals(terms[i])) {
					System.out.println(translations[i]);
					break;
				} else if (i == terms.length - 1) {
					System.out.println(user);
				}
			}
		}
	}
}
