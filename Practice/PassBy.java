package com.learning;

public class PassBy {
	public static void main(String[] args) {

		// Primitives -> Pass by value
		int num = 5;
		modifynum(num);
		System.out.println(num);
		System.out.println("\n");

		// Objects -> Pass by reference
		StringBuilder abc = new StringBuilder("Hello");
		stringmodify(abc);
		System.out.println(abc);
		System.out.println("\n");

		// Strings -> Pass by value (But value is reference)
		String s = "Hello";
		stringmodify(s);
		System.out.println(s);
		System.out.println("\n");

		// Arrays -> Pass by reference
		int[] a = { 1, 2, 3 };
		arraymodify(a);
		System.out.println(a[0]);
	}

	private static void modifynum(int n) {
		System.out.println(n);
		n = n + 5;
		System.out.println(n);
	}

	private static void stringmodify(StringBuilder n) {
		System.out.println(n);
		n.append("hi");
		System.out.println(n);
	}

	public static void stringmodify(String s1) {
		System.out.println(s1);
		s1 = s1.concat("hi");
		System.out.println(s1);
	}

	public static void arraymodify(int[] s) {
		System.out.println(s[0]);
		s[0] = 3;
		System.out.println(s[0]);
	}
}
