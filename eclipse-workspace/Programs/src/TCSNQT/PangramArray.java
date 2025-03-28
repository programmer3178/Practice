package TCSNQT;

public class PangramArray {

	public static void main(String[] args) {
		 char arr[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int res[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i] - 'a';
			res[temp] = 1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (res[i] != 1) {
				System.out.println("It is not a Pangram Array!");
				System.exit(0);
			}
		}
		System.out.println("It is Pangram Array");
	}

}
