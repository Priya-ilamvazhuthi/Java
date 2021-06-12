package com.learning;

class Person1 {
	private String name;

	// Getter
	// We can make the code read-only by only defining getter and not setter
	public String getName() {
		return name;
	}

	// Setter
	// We can make the code write-only by only defining setter and not getter
	public void setName(String newName) {
		this.name = newName;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Person1 myObj = new Person1();
		myObj.setName("John");
		System.out.println(myObj.getName());
		// myObj.name throws error as name is private
		// System.out.println(myObj.name);
	}
}
