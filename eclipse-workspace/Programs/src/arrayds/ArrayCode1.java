package arrayds;

import java.util.Scanner;

public class ArrayCode1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n = sc.nextInt();
		
		//creating array
		int arr[] = new int[n];
		//collecting marks
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the marks of student no" + (i+1));
			arr[i] = sc.nextInt();
		}
		//display marks
		for(int i=0;i<arr.length;i++) {
			System.out.println("The marks of student no" +(i + 1)+"is=" +arr[i]);
		}
	
	}

}
