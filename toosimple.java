public class toosimple {
	public static void main(String[] args) {
		int one = new String().length();
		one++;
		int two = one + one;
		int four = two + two;
		int eight = four + four;
		int sixteen = eight + eight;
		int thirtyTwo = sixteen + sixteen;
		int sixtyFour = thirtyTwo + thirtyTwo;

		char H = (char) (sixtyFour + eight);
		char e = (char) (sixtyFour + thirtyTwo + four + one);
		char l = (char) (sixtyFour + thirtyTwo + eight + four);
		char o = (char) (sixtyFour + thirtyTwo + sixteen - one);
		char comma = (char) (thirtyTwo + eight + four);
		char space = (char) (thirtyTwo);
		char W = (char) (sixtyFour + sixteen + eight - one);
		char r = (char) (sixtyFour + thirtyTwo + sixteen + two);
		char d = (char) (sixtyFour + thirtyTwo + four);
		char exclamation = (char) (thirtyTwo + one);

		StringBuilder helloWorld = new StringBuilder();
		for (char c : new char[] {H, e, l, l, o, comma, space, W, o, r, l, d, exclamation}) {
			helloWorld.append(c);
		}
		System.out.println(helloWorld);
	}
}