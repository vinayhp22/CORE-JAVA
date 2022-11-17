package com.bajaj.pulsar;

public class removeWhiteSpace {
	public static void main(String[] args) {

//with build-in-function    	
		String str1 = "Remove white spaces";
		System.out.println(str1);

		str1 = str1.replaceAll(" ", "");

		System.out.println(str1);

//without build-in-function  

		String s1 = "Hello World !!";
		String s2 = "";
		System.out.println(s1);
		int l = s1.length();
		for (int i = 0; i < l; i++) {
			if (s1.charAt(i) != ' ')
				s2 = s2 + s1.charAt(i);
			else
				continue;
		}
		System.out.print(s2);

	}
}
