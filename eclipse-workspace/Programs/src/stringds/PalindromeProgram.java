package stringds;

import java.util.Scanner;

public class PalindromeProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String temp = " ";
		for(int i =str.length() - 1;i >= 0;i--) {
			temp = temp + str.charAt(i);
		}
		if(str.equals(temp) == true) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not palindrome!");
		}
	}

}
