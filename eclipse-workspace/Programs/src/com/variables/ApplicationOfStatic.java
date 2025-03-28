package com.variables;

import java.util.Scanner;

class Farmer{
	double principle;
	double time;
	static double rate;
	double si;
static {
	rate = 7.5785;
}
void collectData() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the principle:");
	principle = sc.nextDouble();
	System.out.println("Enter the time:");
	time = sc.nextDouble();
}
void calculate() {
	si = (principle * rate * time) / 100;
	
}
void display() {
	System.out.println("Simple Interest is" +" " + si);
}
}
public class ApplicationOfStatic {

	public static void main(String[] args) {
		Farmer f1 = new Farmer();
		f1.collectData();
		f1.calculate();
		f1.display();
		Farmer f2 = new Farmer();
		f2.collectData();
		f2.calculate();
		f2.display();
		Farmer f3 = new Farmer();
		f3.collectData();
		f3.calculate();
		f3.display();
	}
}


