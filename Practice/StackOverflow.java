package com.learning;

public class StackOverflow {
	public static void main(String[] args) {
		StackOverflow.recursivePrint(1);
	}

	// Improper recursion might cause stack to overflow
	public static void recursivePrint(int num) {
		System.out.println("Number: " + num);
		if (num == 0)
			return;
		else
			recursivePrint(++num);
	}
}
