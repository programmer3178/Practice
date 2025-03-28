package SortingTechniques;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 23, 43, 12, 7, 56, 89, 44, 22, 39 };
		int highest = 0;
		int lowest = 0;
		int temp = 0;
		System.out.println("Array before sorting:");
		for (Integer i : arr) {
			System.out.println(i + " ");
		}
		System.out.println();
		System.out.println("--------------------------------");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (Integer i : arr) {
			System.out.println(i + " ");
		}
		System.out.println();
		System.out.println("----------------------");
		System.out.println("Element with minimum value is" + arr[0]);
		System.out.println("Element with minimum value is" + arr[arr.length - 1]);
	}
}
