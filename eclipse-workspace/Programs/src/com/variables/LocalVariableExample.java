package com.variables;

class Calculator{
	void add() {
		int a =10;
		int b = 20;
		int c = a + b;
		System.out.println("Result is" +" " + c);
	}
	void sub(int a, int b) {
		int c = a - b;
		System.out.println("Result is" + " " + c);
		
	}

}
public class LocalVariableExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.add();
		cal.sub(10, 5);
	}

}
