package SearchingTechniques;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {23, 43, 12, 7, 56, 89, 44, 22, 39};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key element:");
		int key = sc.nextInt();
		
		for(int i = 0;i < arr.length; i++) {
			if(key == arr[i]) {
				System.out.println("Key found at position number" + " " +(i));
				System.exit(0);
			}
		}
		System.out.println("Key not found!");
}
}