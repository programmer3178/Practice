package stringds;
/*
 * Step 1: Collect the strings
 * Step 2:Create 2 arrays which is having the same size as the 2 strings provided the string have same size
 * else directly print that the strings are not anagrams.
* Step 3: Traverse the strings and store the characters into the array.
* Step 4: Sort the arrays using Bubble Sort.
* Step 5: Compare the arrays using equality.
*/
import java.util.Scanner;

class Sorting{
	char[] sort(char c[]) {
		char temp;
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i] > c[j]) {
					temp = c[i];
					c[i] = c[j];
					c[j] =temp;
				}
			}
		}
	return c;
	}
}
public class AnagramsStrings {

	public static void main(String[] args) {
		//Step:1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String str1 = sc.next();
		System.out.println("Enter the second string:");
		String str2 = sc.next();
		System.out.println("------------------------");
		
		//Step: 2
		if(str1.length() == str2.length()) {
			char c1[] = new char[str1.length()];
			char c2[] = new char[str2.length()];
			
			//Step:3
			for(int i = 0;i<str1.length();i++) {
				c1[i] = str1.charAt(i);
				c2[i] = str2.charAt(i);
			}
	//Step: 4
	//Sorting array c1
			Sorting s = new Sorting();
			c1 = s.sort(c1);
			//Sorting array c2
			c2 = s.sort(c2);
			
			for(Character c : c1) {
				System.out.println(c + " ");
			}
		System.out.println();
		System.out.println("----------------------");
		for(Character c : c2) {
			System.out.println(c +" ");
		}
		System.out.println();
		System.out.println("-----------------------");
		//Step: 5
		for(int i = 0;i<c1.length;i++) {
			if(c1[i] != c2[i]) {
				System.out.println("The strings are not anagrams!");
				System.exit(0);
			}
		}
	System.out.println("The strings are anagrams");
		}
	}
}