import java.util.Scanner;

public class ccc12s3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int times = input.nextInt();
		int[] array = new int[1000];

		for (int i = 0; i < times; i++) {
			array[input.nextInt()-1]++;
		}

		int maxFreqInd = 0; // delete comments later, this represents index of highest frequency
		int maxFreq = 0;
		int maxFreq2Ind = 0;
		int maxFreq2 = 0; // index of second highest
		int maxFreq2UpInd = 0;
		int maxFreq2Up = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= maxFreq) {
				maxFreqInd = i + 1;
				maxFreq = array[i];
			}
		}

		for (int i = array.length-1; i >= 0; i--) {
			if (array[i] >= maxFreq2 && maxFreqInd != i+1) {
				maxFreq2Ind = i + 1;
				maxFreq2 = array[i];
			}
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= maxFreq2Up && maxFreqInd != i+1) {
				maxFreq2UpInd = i + 1;
				maxFreq2Up = array[i];
			}
		}
		
		int bigDiff = Math.abs(maxFreqInd - maxFreq2UpInd) > Math.abs(maxFreqInd - maxFreq2Ind) ? maxFreq2UpInd : maxFreq2Ind;
		System.out.println(Math.abs(maxFreqInd - bigDiff));
	}
}
