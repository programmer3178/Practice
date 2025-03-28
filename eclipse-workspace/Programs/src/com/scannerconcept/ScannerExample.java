package com.scannerconcept;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Byte data:");
		byte bt = sc.nextByte();
		System.out.println("Byte Data is" +" " + bt);
		System.out.println("Enter the short data:");
		short st = sc.nextShort();
		System.out.println("Short Data is" + " "+st);
		System.out.println("Enter the integer data:");
		int it = sc.nextInt();
		System.out.println("Integer Data is" +" "+ it);
		System.out.println("Enter the long data:");
		long lg = sc.nextLong();
		System.out.println("Long Data is" + " " + lg);
		System.out.println("Enter the float data:");
		float ft = sc.nextFloat();
		System.out.println("Float Data is" + " " + ft);
		System.out.println("Enter the double data:");
		double db = sc.nextDouble();
		System.out.println("Double Data is" + " " + db);
		System.out.println("Enter the boolean data:");
		boolean bl = sc.nextBoolean();
		System.out.println("Boolean Data is" + " " + bl);
		System.out.println("Enter the string data:");
		String str = sc.next();
		System.out.println("String Data is" +" " + str);
		}
}
