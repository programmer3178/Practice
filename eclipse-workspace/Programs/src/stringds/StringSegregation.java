package stringds;

import java.util.Scanner;

public class StringSegregation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.next();
		String alphabets = " ";
		String numbers = " ";
		String spec_chars = " ";
		int sum = 0;
		int alpha = 0;
		int num = 0;
		int specchars = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				numbers = numbers + str.charAt(i);
				alpha = alpha + (int) str.charAt(i);

			} else if ((str.charAt(i) >= 65 && str.charAt(i) <= 90)||(str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
				alphabets = alphabets + str.charAt(i);
				num = num + (int) str.charAt(i);
			} else if((str.charAt(i) >= 32 && str.charAt(i) <= 47)||(str.charAt(i) >= 58 && str.charAt(i) <= 66)||(str.charAt(i) >= 123 && str.charAt(i) <= 126)
					||(str.charAt(i) >= 91 && str.charAt(i) <=96)){
				spec_chars = spec_chars + str.charAt(i);
				specchars = specchars + (int) str.charAt(i);

			}
		}
			System.out.println("Seperated alphabets are" + " " + alphabets);
			System.out.println("Seperated numbers are" + " " + numbers);
			System.out.println("Seperated special characters are" + " " + spec_chars);
			sum = alpha + num + specchars;
			System.out.println("Sum= " + sum);
		
		}

	}
