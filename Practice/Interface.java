package com.learning;

interface inter_face {
	int n = 10;

	int square(int num);

	static void display() {
		System.out.println(n);
	}
}

// Interface extends interface not implement
interface inter_face1 extends inter_face {
	int cube(int num);
}

// Child class must implement all methods in interface or declared abstract
class abc implements inter_face1 {
	@Override
	public int square(int num) {
		return num * num;
	}

	@Override
	public int cube(int num) {
		return num * num * num;
	}
}

class Interface {
	public static void main(String[] args) {
		// Cannot create object for interface
		// inter_face i = new inter_face();
		inter_face1 i1 = new abc();
		System.out.println(i1.cube(5));
		System.out.println(i1.square(5));
		System.out.println(i1.n);
	}
}
