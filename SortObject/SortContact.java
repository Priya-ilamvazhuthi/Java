package com.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Implementing Comparable to use compareTo()
class Contact implements Comparable<Contact> {
	private String name, mobileNumber, emailId;
	public static String sortBy;

	Contact(String name, String mobileNumber, String emailId) {
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getName() {
		return name;
	}

	// Changing toString() to return String in the below form
	@Override
	public String toString() {
		return "[" + name + " | " + mobileNumber + " | " + emailId + "]";
	}

	@Override
	public int compareTo(Contact o) {
		return switch (sortBy) {
		// If 1, sort by name
		case "1" -> this.name.compareTo(o.getName());
		// If 2, sort by number
		case "2" -> this.mobileNumber.compareTo(o.getMobileNumber());
		// If 3, sort by email
		case "3" -> this.emailId.compareTo(o.getEmailId());
		// Other than that, no sorting
		default -> 0;
		};
	}
}

public class SortContact {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Contact[] contactArray = new Contact[4];

		contactArray[0] = new Contact("John", "9988776655", "john12@gmail.com");
		contactArray[1] = new Contact("Alexa", "9988776657", "alex@yahoo.com");
		contactArray[2] = new Contact("Johnny", "9888776655", "johnny@gmail.com");
		contactArray[3] = new Contact("Alex", "9988776654", "alex@gmail.com");

		System.out.println("Sort by:\n[1] Name\n[2] Mobile number\n[3] Email ID");
		Contact.sortBy = input.readLine();
		System.out.println("Before sort :");
		System.out.println(Arrays.toString(contactArray));
		// Sorting the array of objects
		Arrays.sort(contactArray);
		System.out.println("After sort :");
		System.out.println(Arrays.toString(contactArray));
	}
}
