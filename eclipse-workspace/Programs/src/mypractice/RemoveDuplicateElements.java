package mypractice;

import java.util.Arrays;

public class RemoveDuplicateElements {

	static void unique_array(int[] array) {
		System.out.println("Original Array:");
		// Iterating through original array and print its contents
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}

		// Assuming all elements in the input are unique
		int no_unique_elements = array.length;
		// Comparing each element with all other elements to find duplicate element
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				// If any two elements are found equal
				if (array[i] == array[j]) {
					// Replace the duplicate elements with the last unique element
					array[j] = array[no_unique_elements - 1];
					no_unique_elements--;
					j--;

				}
			}
		}
		int[] array1 = Arrays.copyOf(array, no_unique_elements);
		System.out.println();
		System.out.println("Array with unique values:");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i] + "\t");
		}
		System.out.println();
		System.out.println("-------------------------------");
	}

	public static void main(String[] args) {
		unique_array(new int[] { 0, 3, -2, 4, 3,2});
		unique_array(new int[] { 10, 20, 10, 20, 11, 22 });

	}
}
