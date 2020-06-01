import java.util.*;

public class ccc20s3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[] needleArray = input.nextLine().toCharArray();
		Arrays.sort(needleArray);
		String needle = new String(needleArray);
		
		String haystack = input.nextLine();
		List<String> list = new ArrayList();
		char[] tempArray;
		
		int c = 0;
		for (int i = 0; i < haystack.length() - (needle.length() - 1); i++) {
			String temp = haystack.substring(i, i + needle.length());
			if (! list.contains(temp)) {
				list.add(temp);
				tempArray = temp.toCharArray();
				Arrays.sort(tempArray);
				if (new String(tempArray).equals(needle)) {
					c++;
				}
			}
		}
		System.out.println(c);
	}
}
