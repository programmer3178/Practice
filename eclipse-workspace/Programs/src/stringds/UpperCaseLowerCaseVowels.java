package stringds;

import java.util.Scanner;

public class UpperCaseLowerCaseVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		int u_vowels = 0;
		int l_vowels = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
						|| str.charAt(i) == 'U') {
					u_vowels++;
				} else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
					if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
							|| str.charAt(i) == 'u') {
						l_vowels++;
					}

				}
			}
			System.out.println("UpperCase Vowels=" + " " + u_vowels);
			System.out.println("UpperCase Vowels=" + " " + l_vowels);
		}
	}
}
