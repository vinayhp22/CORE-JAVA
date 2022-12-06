package com.bajaj.pulsar;

public class CountWhiteSpaces {
	public static void main(String[] args) {
		String str = "Count the white spaces ";
		System.out.println("Counting white spaces");
		int count = 0;
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				count++;
			}
		}
		System.out.println(count);
		count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
		count = 0;
		for (int i = str.length() - 1; i >= 0 ; i--) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
