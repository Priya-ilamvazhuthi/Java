package com.learning;

import java.util.Arrays;

public class Strings_Arrays {
	public static void main(String[] arg) {

		// Immutable
		// s1 is reference variable
		String s1 = "Hello";
		s1.concat(" World!");
		// Strings are immutable. So s1 remains "Hello"
		System.out.println(s1);

		String s2 = "Hi";
		s2 = s2.concat(s1);
		// We can manipulate Strings
		System.out.println(s2);

		// String literals
		String str1 = "Priya";
		String str2 = "Priya";
		// Both str1 and str2 has same hash code(reference)

		// '==' compares the reference while '.equals()' compares value
		if (str1 == str2)
			System.out.println("Yes - First time - Reference");
		else
			System.out.println("No - First time - Reference");
		if (str1.equals(str2))
			System.out.println("Yes - First time - Value");
		else
			System.out.println("No - First time - Value");

		// When changed, Strings point to different references
		str1 = str1.concat("Pd");
		if (str1 == str2)
			System.out.println("Yes - Second time - Reference");
		else
			System.out.println("No - Second time - Reference");
		if (str1.equals(str2))
			System.out.println("Yes - Second time - Value");
		else
			System.out.println("No - Second time - Value");
		System.out.println(str1 + "\n" + str2);

		// String literal and a String object

		// String literals are stored in String pool
		String string1 = "Priya";
		// new keyword creates object and is stored in heap
		String string2 = new String("Priya");
		// string1 and string2 has different reference but same value
		if (string1 == string2)
			System.out.println("Yes - First time - Reference");
		else
			System.out.println("No - First time - Reference");
		if (string1.equals(string2))
			System.out.println("Yes - First time - Value");
		else
			System.out.println("No - First time - Value");
		System.out.println(str1 + "\n" + str2);

		string1 = string1.concat("Pd");
		if (string1 == string2)
			System.out.println("Yes - Second time - Reference");
		else
			System.out.println("No - Second time - Reference");
		if (string1.equals(string2))
			System.out.println("Yes - Second time - Value");
		else
			System.out.println("No - Second time - Value");
		System.out.println(string1 + "\n" + string2);

		// Array value or reference
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3, 4, 5 };
		if (a == b)
			System.out.println("First time - Same Reference");
		else
			System.out.println("First time - Different Reference");
		if (Arrays.equals(a, b))
			System.out.println("First time - Value same");
		else
			System.out.println("First time - Value different");

		b = a;
		if (a == b)
			System.out.println("Second time - Same Reference");
		else
			System.out.println("Second time - Different Reference");
		if (Arrays.equals(a, b))
			System.out.println("Second time - Value same");
		else
			System.out.println("Second time - Value different");

		b = a.clone();
		if (a == b)
			System.out.println("Third time - Same Reference");
		else
			System.out.println("Third time - Different Reference");
		if (Arrays.equals(a, b))
			System.out.println("Third time - Value same");
		else
			System.out.println("Third time - Value different");
	}
}
