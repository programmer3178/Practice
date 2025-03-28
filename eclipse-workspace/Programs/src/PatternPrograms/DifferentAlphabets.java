package PatternPrograms;

import java.util.Scanner;

public class DifferentAlphabets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j != 0 && j != (n - 1) || i == n / 2 || j == 0 && i != 0 || j != (n - 1)) {
					System.out.println("# ");
				} else {
					System.out.println("  ");
				}
			}
			System.out.println();
		}

	}

}
