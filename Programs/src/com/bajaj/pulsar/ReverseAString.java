package com.bajaj.pulsar;

public class ReverseAString {

	public static void main(String[] args) {

		String str = "123456", rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		StringBuffer buffer = new StringBuffer(str);
		buffer.reverse();
		System.out.println(buffer);
		
	}
		
}
