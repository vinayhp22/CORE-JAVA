package com.bajaj.pulsar;

public class LengthOfAString {

	public static void main(String args[]) {

		String string = "This is hello world";
		System.out.println("length of helloWorld string :" + getLength(string));
	}

	public static int getLength(String str) {
		int length = 0;
		char[] strCharArray = str.toCharArray();
		for (int i=0; i < strCharArray.length; i++) { 
			//for(char c : strCharArray
			length++;
		}
		return length;
	}
}
