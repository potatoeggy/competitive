import java.util.Arrays;

class PythonLists {
	public static void main(String[] args) {
		Object[] array = new Object[6];
		array[0] = 1;
		array[1] = 3;
		array[2] = "potato";
		array[3] = "pomme";
		array[4] = Integer.parseInt(String.valueOf(array[0])) + Integer.parseInt(String.valueOf(array[1]));
		array[5] = String.valueOf(array[2]) + String.valueOf(array[3]);
		System.out.println(Arrays.toString(array));
	}
}