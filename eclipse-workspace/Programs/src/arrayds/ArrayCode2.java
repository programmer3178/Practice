package arrayds;

import java.util.Scanner;

public class ArrayCode2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of wings under Beta Group og Institutions:");
		int wings = sc.nextInt();
		System.out.println("Enter the count of college under each wings:");
		int college = sc.nextInt();

		// creating 2d array
		long arr[][] = new long[wings][college];
		long overall_revenue = 0;

		// collecting data
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside the wing no" + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the revenue made by college number:");
				arr[i][j] = sc.nextLong();
				overall_revenue = overall_revenue + arr[i][j];

			}
		}
		System.out.println("-----------------------------");
		// displaying data
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Inside the wing no" + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("The revenue made by college number" + (j + 1) + "is = " + arr[i][j]);

			}
		}
		System.out.println("----------------------------------");
		System.out.println("Overall Reveneue made by Beta Group of Instituions =" + overall_revenue);
	}
}
