package com.variables;

import java.util.Scanner;

class Dog {
	String name;
	String color;
	String breed;
	int age;
	int cost;

	void allocateData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the dog:");
		name = scan.next();
		System.out.println("Name of the dog is" + " " + name);
		System.out.println("Enter the  of color of the dog:");
		color = scan.next();
		System.out.println("Color of the dog is" + " " + color);
		System.out.println("Enter the breed of the dog:");
		breed = scan.next();
		System.out.println("Breed of the dog is" + " " + name);
		System.out.println("Enter the name of the dog:");
		name = scan.next();
		System.out.println("Name of the dog is" + " " + name);
	}

	void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(age);
		System.out.println(cost);
	}

	public class InstanceVariableExample {

		public static void main(String[] args) {
			Dog d1 = new Dog();
			d1.display();
			System.out.println("-----------------------");
			d1.allocateData();
			d1.display();
		}
	}
}
