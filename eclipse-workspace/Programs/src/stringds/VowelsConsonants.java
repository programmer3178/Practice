package stringds;

import java.util.Scanner;

public class VowelsConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		int vowel_count = 0;
		int consonant_count = 0;
		str = str.toUpperCase();
		for(int i = 0; i < str.length();i++) {
			if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				if(str.charAt(i)== 'A'||str.charAt(i)== 'E'||str.charAt(i)== 'I'||str.charAt(i)== 'O'||str.charAt(i)== 'U') {
					vowel_count++;
				}
			else {
				consonant_count++;
			}
		}

	}
	System.out.println("Length of string is"+" "+str.length());
	System.out.println("Total number of vowels="+vowel_count);
	System.out.println("Total number of consonants="+consonant_count);
}
}