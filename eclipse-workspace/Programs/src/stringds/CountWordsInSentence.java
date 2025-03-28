package stringds;

import java.util.Scanner;

public class CountWordsInSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();

		str.trim();
		int space_count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ') {
				space_count++;
			}
		}
		int words = space_count + 1;
		System.out.println("Number of words="+" "+words);
	}

}
