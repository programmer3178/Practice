package stringds;

import java.util.Scanner;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		str = str.trim();
		int space_count = 0;
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
					space_count++;
				}
			}
			int word_count = space_count + 1;

			String arr[] = new String[word_count];
			String temp = " ";
			int count = arr.length - 1;
			for(int i = str.length() - 1; i >= 0; i--) {
				if (str.charAt(i) != ' ') {
					temp = temp + str.charAt(i);
				} else if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
					arr[count] = temp;
					temp = " ";
					count--;
				}
			}
			arr[count] = temp;

			for (String str1 : arr) {
				System.out.print(str1+"");
			}
		}
	}

