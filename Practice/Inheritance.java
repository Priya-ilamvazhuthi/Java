package com.learning;

class parent {
	// School name, Principal same for all students
	String schoolname;
	String principal;

	parent() {
		System.out.println("Default constructor of Parent class");
	}

	void student() {
		System.out.println("School: " + schoolname + "\n" + "Principal: " + principal);
	}
}

class child extends parent {
	// School name, principal same as parent
	// ClassTeacher differs
	String classteacher;

	child() {
		System.out.println("Default constructor of Child class");
	}

	void student() {
		super.student();
		System.out.println("Teacher: " + classteacher);
	}
}

class grandchild extends child {
	// School name, principal, classteacher same as parent
	// Roll number differs
	int rollno;

	grandchild() {
		System.out.println("Default constructor of grandchild class");
	}

	void student() {
		super.student();
		System.out.println("Roll num: " + rollno);
	}
}

public class Inheritance {
	public static void main(String[] args) {
		child Asection = new child();
		child Bsection = new child();
		grandchild Csection = new grandchild();
		System.out.println("---------A section----------");
		Asection.principal = "Gsir";
		Asection.schoolname = "DAV";
		Asection.classteacher = "Devi";
		Asection.student();

		System.out.println("---------B section----------");
		Bsection.principal = "Gsir";
		Bsection.schoolname = "DAV";
		Bsection.classteacher = "Priya";
		Bsection.student();

		System.out.println("---------C section----------");
		Csection.principal = "Gsir";
		Csection.schoolname = "DAV";
		Csection.classteacher = "Dharsh";
		Csection.rollno = 12;
		Csection.student();

		System.out.println("---------C section----------");
		Csection.principal = "Gsir";
		Csection.schoolname = "DAV";
		Csection.classteacher = "Dharsh";
		Csection.rollno = 6;
		Csection.student();
	}
}
