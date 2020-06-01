import java.util.Scanner;
// broken, redo
class ccc09j4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int w = input.nextInt();
		String[] ad = "WELCOME TO CCC GOOD LUCK TODAY".split(" ");
		
		int usedWidth = 0;
		int tempBase = 0;
		for (int i = 0; i < ad.length; i++) {
			System.out.println("reached initial for");
			if (usedWidth + ad[i].length() + 1 > w) {
				System.out.println("reached while");
				while (usedWidth != w) {
					for (int j = tempBase; j < i; j++) {
						System.out.println("doing something");
						ad[j] += " ";
						usedWidth++;
						if (usedWidth == w) {
							break;
						}
					}
				}
				usedWidth = 0;
				tempBase = i;
			} else {
				usedWidth += ad[i].length() + 1;
				System.out.println(usedWidth);
			}	
		}
		for (int i = 0; i < ad.length; i++) {
			System.out.println(ad[i]);
		}
	}
}			
