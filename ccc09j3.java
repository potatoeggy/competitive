import java.util.Scanner;

class ccc09j3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] timezones = {0, -300, -200, -100, 0, 100, 130};
		int user = input.nextInt();
		for (int i = 0; i < timezones.length; i++) {
			timezones[i] += user;
			if (timezones[i] < 0) {
				timezones[i] += 2400;
			}
			if (timezones[i] % 100 >= 60) {
				timezones[i] += 40;
			}
			if (timezones[i] >= 2400) {
				timezones[i] -= 2400;
			}
			if (timezones[i] % 100 >= 60) {
				timezones[i] += 40;
			}
		}
		
		
		
		System.out.println(timezones[0] + " in Ottawa");
		System.out.println(timezones[1] + " in Victoria");
		System.out.println(timezones[2] + " in Edmonton");
		System.out.println(timezones[3] + " in Winnipeg");
		System.out.println(timezones[4] + " in Toronto");
		System.out.println(timezones[5] + " in Halifax");
		System.out.println(timezones[6] + " in St. John's");
	}
}
