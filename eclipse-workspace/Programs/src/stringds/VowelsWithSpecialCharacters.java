package stringds;

import java.util.Scanner;

public class VowelsWithSpecialCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		String str_temp = " ";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
				str_temp = str_temp + '#';
			} else if (str.charAt(i) == 'e' || str.charAt(i) == 'E') {
				str_temp = str_temp + '*';
			} else if (str.charAt(i) == 'i' || str.charAt(i) == 'I') {
				str_temp = str_temp + '&';
			} else if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
				str_temp = str_temp + '*';
			} else if (str.charAt(i) == 'u' || str.charAt(i) == 'U') {
				str_temp = str_temp + '^';
			}
		}
	}
}
