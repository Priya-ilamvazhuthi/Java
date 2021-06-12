package com.learning;

abstract class student {
	private String name;
	private int registerNum;

	public void studentInfo(String name, int registerNum) {
		this.name = name;
		this.registerNum = registerNum;
		System.out.println("Student info method");
	}

	public abstract void studying();

	void display() {
		System.out.println(name + " " + registerNum);
	}
}

class person extends student {
	@Override
	public void studying() {
		System.out.println("student studying");
	}
}

public class Abstraction {
	public static void main(String[] args) {
		student a = new person();
		a.studying();
		a.studentInfo("Priya", 21);
		a.display();
	}
}