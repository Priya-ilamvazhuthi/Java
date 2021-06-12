package com.learning;

class A {
	void add(int a, int b) {
		System.out.println("Parent");
		System.out.println(a - b);
	}
}

class B extends A {
	void add(int a, int b) {
		// executes overridden method add() in parent class
		super.add(a, b);
		System.out.println("Child");
		System.out.println(a + b);
	}
}

public class Polymorphism {
	int a = 7, b = 6;

	void add() {
		System.out.println(a + b);
	}

	void add(int a, int b) {
		a = this.a;
		b = this.b;
		System.out.println(a + b);
	}

	void add(float a, float b) {
		System.out.println(a + b);
	}

	void addtwo(String str) {
		System.out.println(str + 2);
	}

	void addtwo(int n) {
		System.out.println(n + 2);
	}

	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		// method overloading
		p.add();
		p.add(2, 4);
		p.add(10.7f, 5.5f);
		// operator overloading
		// '+' operator adds integers and concatenates strings
		p.addtwo(2);
		p.addtwo("HI");
		B b = new B();
		// method overriding
		b.add(5, 6);

	}
}
