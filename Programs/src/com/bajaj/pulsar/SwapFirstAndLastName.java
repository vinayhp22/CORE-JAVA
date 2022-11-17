package com.bajaj.pulsar;

public class SwapFirstAndLastName {

	public static void main(String[] args) {

		String name = "Vinay HP";

		System.out.println("Before Swap: " + name);

		String firstName = name.substring(0, name.indexOf(" "));
		String lastName = name.substring(name.indexOf(" "));

		String swapName = lastName + " " + firstName;

		System.out.println("After Swap: " + swapName);
	}
}
