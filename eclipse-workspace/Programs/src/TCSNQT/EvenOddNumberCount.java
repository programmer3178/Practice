package TCSNQT;

import java.util.Scanner;

public class EvenOddNumberCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int even = 0;
		int odd = 0;
		System.out.println("Enter the array elements:");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
			if(arr[i] % 2 == 0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Even count=" + even);
		System.out.println("Odd count=" + odd);
	}
}
