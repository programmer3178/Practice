package stringds;

import java.util.Scanner;

public class VowelsConsonants1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		int vowel_count = 0;
		int consonant_count = 0;
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
						|| str.charAt(i) == 'u') {
					vowel_count++;
				} else {
					consonant_count++;
				}
			}

		}
		System.out.println("Length of string is" + " " + str.length());
		System.out.println("Total number of vowels=" + vowel_count);
		System.out.println("Total number of consonants=" + consonant_count);
	}

}
