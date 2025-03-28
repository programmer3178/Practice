package TCSNQT;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of matrices:");
		int n = sc.nextInt();
		int m1[][] = new int[n][n];
		int m2[][] = new int[n][n];
		int res[][] = new int[n][n];
		System.out.println("Enter matrix A:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m1[i][j] = sc.nextInt();
			}
		}
		System.out.println("------------------------");
		System.out.println("Enter matrix B:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m2[i][j] = sc.nextInt();
			}
		}
		System.out.println("------------------------");
		System.out.println("Resultant Matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				res[i][j] = m1[i][j] + m2[i][j];
				System.out.println(res[i][j]);
			}
		}
	}
}