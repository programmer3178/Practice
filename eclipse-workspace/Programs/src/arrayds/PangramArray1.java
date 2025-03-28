package arrayds;

public class PangramArray1 {

	public static void main(String[] args) {
		char arr[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int res[] = new int[26];
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			res[i] = 0;
		}
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i] - 'a';
			res[temp] = 1;
		}
		System.out.println("------------------------");
		for (int i = 0; i < res.length; i++) {
			if (res[temp] != 1) {
				System.out.println("It is not a Panagram Array!");
				System.exit(0);
			}
		}
		System.out.println("It is a Panagram Array");
	}
}