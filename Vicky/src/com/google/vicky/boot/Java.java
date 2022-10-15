package com.google.vicky.boot;

public class Java {
	static String name[] = { "null", "null", "null", "null", "null" };
	static String rename;
	public static void Rename(String name, String rename) {
		System.out.println("Renaming the name, name: " + name);
		name = rename;
		System.out.println("Name renamed as:  " + rename);
	}
	public static void displayDetails() {
		for (int play = 0; play < name.length; play++) {
			System.out.println("The name=  " +name+"Renamed as :  "+rename);
		}
	}
}
