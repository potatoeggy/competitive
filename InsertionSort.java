import java.util.Arrays;

class InsertionSort {
	public static void main(String[] args) {
		int[] array = {4, 3, 6, 2, 6, 1, 2, 3, 6, 10};
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0 && array[j] < array[j-1]; j--) {
				int temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}