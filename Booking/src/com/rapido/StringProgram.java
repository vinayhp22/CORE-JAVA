package com.rapido;

public class StringProgram {

	public static void main(String[] args) {

		String tripleRide = "Triple Riding is a Kannada movie released on 25 Nov, 2022."
				+ " The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, "
				+ "Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters.";

		System.out.println("The String value : " + tripleRide);

		// err msg to indicate red in the console
		System.err.println(System.lineSeparator() + "1.Split all by space");
		String[] splitBySpace = tripleRide.split(" ");
		for (int i = 0; i < splitBySpace.length; i++) {
			System.out.println(splitBySpace[i]);
		}
		System.err.println(System.lineSeparator() + "2.Write logic to find no of 'R' in above sentence");

		char ch = 'R';
		String upperCase = tripleRide.toUpperCase();
		int charR = 0;
		for (int i = 0; i < upperCase.length(); i++) {
			if (ch == upperCase.charAt(i)) {
				charR++;
			}
		}
		System.out.println("No. of R's :" + charR);

		System.err.println(System.lineSeparator() + "3.Find all digits in above string");
		int count = 0;
		for (int i = 0; i < tripleRide.length(); i++) {
			if (Character.isDigit(tripleRide.charAt(i))) {
				count++;
			}
		}
		System.out.println("No. of digits in the String : " + count);

		System.err.println(System.lineSeparator() + "4.Split by ,(cama)");
		String[] splitByCama = tripleRide.split(",");
		for (int i = 0; i < splitByCama.length; i++) {
			System.out.println(splitByCama[i]);
		}

		System.err.println(System.lineSeparator() + "5. Convert above string to char []");
		char[] tripleRideChar = tripleRide.toCharArray();

		for (int i = 0; i < tripleRideChar.length; i++) {
			System.out.print(tripleRideChar[i] + " ");
		}

		System.err.println(System.lineSeparator() + "6. Reverse above string");
		for (int i = tripleRide.length() - 1; i >= 0; i--) {
			System.out.print(tripleRideChar[i]);
		}

		System.err.println(System.lineSeparator() + "7.Convert to upper case");
		System.out.println(upperCase);

		System.err.println(System.lineSeparator() + "8.Convert to lower case");
		String lowerCase = tripleRide.toLowerCase();
		System.out.println(lowerCase);

		System.err.println(System.lineSeparator() + "9. Print all duplicate Characters");
		int duplicate = 0;
		String[] strArr = lowerCase.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			for (int j = i + 1; j < strArr.length; j++) {
				if (strArr[i].equals(strArr[j])) {
					System.out.println(strArr[j]);
					duplicate++;
				}
			}
		}
		System.out.println("There are " + duplicate + " duplicate Characters in the string");

		System.err.println(System.lineSeparator() + "10. find Palindrome word in above string ");

		String reverseStr = "";
		int palindrome = 0;

		for (int i = 0; i < strArr.length; i++) {
			int strLength = strArr[i].length();
			for (int j = strLength - 1; j >= 0; j--) {
				reverseStr = reverseStr + strArr[i].charAt(j);
			}
			if (strArr[i].equals(reverseStr) && strArr[i].length() > 1) {
				System.out.println(strArr[i] + " is a Palindrome String.");
				reverseStr = "";
				palindrome++;
			} else {
				reverseStr = "";
			}
		}
		if (palindrome == 0) {
			System.out.println("There is no palindrome in the String..");
		}
	}

}
