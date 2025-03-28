package stringds;

import java.util.Scanner;

public class ReplaceVowelsConsonants1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		String str_temp = " ";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
						|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
						|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {
					str_temp = str_temp + '$';
				} else {
					str_temp = str_temp + str.charAt(i);
				}
			}

			System.out.println("Replaced String is" + str_temp);
		}

	}

}
