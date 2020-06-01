import java.util.Scanner;

public class dmopc19c5p2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int turns = input.nextInt();
		
		int charlie = input.nextInt();
		int bot = charlie;

		int charlieCache = 0;
		int botCache = 0;

		String[] charlieActions = new String[turns];
		int[] charlieDamage = new int[turns];

		String[] botActions = new String[turns];
		int[] botDamage = new int[turns];

		for (int i = 0; i < turns; i++) {
			charlieActions[i] = input.next();
			charlieDamage[i] = input.nextInt();
		}

		for (int i = 0; i < turns; i++) {
			botActions[i] = input.next();
			botDamage[i] = input.nextInt();
		}
		
		for (int i = 0; i < turns; i++) {
			String action = charlieActions[i];
			int damage = charlieDamage[i];
			if (action.equals("A")) {
				bot -= damage;
				bot += botCache;
			} else {
				charlieCache += damage;
				bot -= botCache;
			}
			botCache = 0;

			if (bot == 0) {
				System.out.println("VICTORY");
				return;
			}

			action = botActions[i];
			damage = botDamage[i];
			if (action.equals("A")) {
				charlie -= damage;
				charlie += charlieCache;
			} else {
				botCache += damage;
				charlie -= charlieCache;
			}
			charlieCache = 0;

			if (charlie == 0) {
				System.out.println("DEFEAT");
				return;
			}
		}

		// your edge case handling is broken (end of list damage reduction)
		charlie -= charlieCache;
		if (charlie == 0) {
			System.out.println("DEFEAT");
			return;
		}

		bot -= botCache;
		if (bot == 0) {
			System.out.println("VICTORY");
			return;
		}
		System.out.println("TIE");
	}
}
