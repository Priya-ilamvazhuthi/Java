package com.learning;

public class GarbageCollection {
	public void finalize() {
		System.out.println("garbage collected");
	}

	public static void main(String[] args) {
		GarbageCollection s = new GarbageCollection();
		System.out.println(s);
		// object referring null
		s = null;

		GarbageCollection b = new GarbageCollection();
		GarbageCollection a = new GarbageCollection();
		// Object b reference is assigned to Object a
		a = b;

		// anonymous object
		new GarbageCollection();

		System.gc();
	}
}
