package arrayds;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 34, 74, 67, 90, 13, 76 };
		int res[] = new int[arr.length];
		int temp = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			res[temp] = arr[i];
			temp++;
		}
		System.out.println("-------------------------");
		System.out.println("The original array is");
		
		for (Integer i : arr) {
			System.out.println(i + " ");
		}
		System.out.println();
		System.out.println("-----------------------");
		System.out.println("The reversed array is");
		for (Integer i : res) {
			System.out.println(i + " ");
		}

	}

}
