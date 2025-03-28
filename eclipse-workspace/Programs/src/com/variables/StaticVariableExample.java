package com.variables;

class SampleCode{
	static int var1, var2, var3;//static variables
	int nvar1, nvar2, nvar3;//non-static variable
	//static block
	static {
		var1 = 100;
		var2 = 200;
		var3 = 300;
		//nvar1 = 111;
		//nvar2 = 222;
		//nvar3 = 333;
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}
	//non-static block
	{
		var1 = 2000;
		var2 = 3000;
		var3 = 4000;
		nvar1 = 5000;
		nvar2 = 6000;
		nvar3 = 7000;
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(nvar1);
		System.out.println(nvar2);
		System.out.println(nvar3);
		
}
//static methods
	static void display() {
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		//System.out.println(nvar1);
		//System.out.println(nvar2);
		//System.out.println(nvar3);
		
	}
//non-static method
	void display1() {
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(nvar1);
		System.out.println(nvar2);
		System.out.println(nvar3);
	}
}
public class StaticVariableExample {

	public static void main(String[] args) {
		SampleCode.display();
		System.out.println("---------------------------");
		SampleCode.var1 = 1;
		SampleCode.var2 = 2;
		SampleCode.var3 = 3;
		System.out.println(SampleCode.var1);
		System.out.println(SampleCode.var2);
		System.out.println(SampleCode.var3);
		System.out.println("----------------------");
		SampleCode sc = new SampleCode();
		sc.display();
		System.out.println("-----------------------------");
		sc.display1();
		}
	}
