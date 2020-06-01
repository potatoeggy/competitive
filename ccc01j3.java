import java.util.Scanner;

public class ccc01j3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char[] array = in.nextLine().toCharArray();
		char[][] suits = new char[4][13];
		int clubs = 0;
		int clubsP = 0;
		int diamonds = 0;
		int diamondsP = 0;
		int hearts = 0;
		int heartsP = 0;
		int spades = 0;
		int spadesP = 0;
		
		int selector = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 'C') {
				selector = 0;
			} else if (array[i] == 'D') {
				selector = 1;
			} else if (array[i] == 'H') {
				selector = 2;
			} else if (array[i] == 'S') {
				selector = 3;
			} else {
				for (int j = 0; j < suits[selector].length; j++) {
					if (suits[selector][j] == '\u0000') {
						suits[selector][j] = array[i];
						break;
					}
				}
			}
		}
		
		System.out.println("Cards Dealt Points");
		System.out.print("Clubs ");
		for (int i = 0; i < suits[0].length; i++) {
			if (suits[0][i] != '\u0000') {
				System.out.print(suits[0][i] + " ");
				clubs++;
				if (suits[0][i] == 'A') {
					clubsP += 4;
				} else if (suits[0][i] == 'K') {
					clubsP += 3;
				} else if (suits[0][i] == 'Q') {
					clubsP += 2;
				} else if (suits[0][i] == 'J') {
					clubsP++;
				}
			}
		}
		
		if (clubs == 0) {
			clubsP += 3;
		} else if (clubs == 1) {
			clubsP += 2;
		} else if (clubs == 2) {
			clubsP++;
		}
		System.out.println(clubsP);
		
		System.out.print("Diamonds ");
		for (int i = 0; i < suits[1].length; i++) {
			if (suits[1][i] != '\u0000') {
				System.out.print(suits[1][i] + " ");
				diamonds++;
				if (suits[1][i] == 'A') {
					diamondsP += 4;
				} else if (suits[1][i] == 'K') {
					diamondsP += 3;
				} else if (suits[1][i] == 'Q') {
					diamondsP += 2;
				} else if (suits[1][i] == 'J') {
					diamondsP++;
				}
			}
		}
		
		if (diamonds == 0) {
			diamondsP += 3;
		} else if (diamonds == 1) {
			diamondsP += 2;
		} else if (diamonds == 2) {
			diamondsP++;
		}
		System.out.println(diamondsP);
		
		System.out.print("Hearts ");
		for (int i = 0; i < suits[2].length; i++) {
			if (suits[2][i] != '\u0000') {
				System.out.print(suits[2][i] + " ");
				hearts++;
				if (suits[2][i] == 'A') {
					heartsP += 4;
				} else if (suits[2][i] == 'K') {
					heartsP += 3;
				} else if (suits[2][i] == 'Q') {
					heartsP += 2;
				} else if (suits[2][i] == 'J') {
					heartsP++;
				}
			}
		}
		
		if (hearts == 0) {
			heartsP += 3;
		} else if (hearts == 1) {
			heartsP += 2;
		} else if (hearts == 2) {
			heartsP++;
		}
		System.out.println(heartsP);
		
		System.out.print("Spades ");
		for (int i = 0; i < suits[3].length; i++) {
			if (suits[3][i] != '\u0000') {
				System.out.print(suits[3][i] + " ");
				spades++;
				if (suits[3][i] == 'A') {
					spadesP += 4;
				} else if (suits[3][i] == 'K') {
					spadesP += 3;
				} else if (suits[3][i] == 'Q') {
					spadesP += 2;
				} else if (suits[3][i] == 'J') {
					spadesP++;
				}
			}
		}
		
		if (spades == 0) {
			spadesP += 3;
		} else if (spades == 1) {
			spadesP += 2;
		} else if (spades == 2) {
			spadesP++;
		}
		
		System.out.println(spadesP);
		System.out.println("Total " + (spadesP + heartsP + diamondsP + clubsP));
	}
}
