package stringds;

import java.util.Scanner;

public class ConvertUpperLowerCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.next();
		String result = " ";
		char ch = ' ';
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {

				ch = (char) (str.charAt(i) + 32);

			} else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {

				ch = (char) (str.charAt(i) - 32);
			}
			result += ch;
		}

		System.out.println("Converted String is" + " " + result);
	}

}
