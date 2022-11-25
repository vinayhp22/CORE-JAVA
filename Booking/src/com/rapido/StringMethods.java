package com.rapido;

public class StringMethods {

	public String name = "abcd";
	public String name1 = "ab";
	public String name2 = "ab cd ef";

	public static void main(String[] args) {

		StringMethods s = new StringMethods();

		boolean empty = s.name.isEmpty();
		System.out.println(empty);
		// Returns true if, and only if, length() is 0

		System.out.println(s.name.concat("efgh"));
		// Concatenates the specified string to the end of this string.

		System.out.println(s.name.length());
		/*
		 * Returns the length of this string. The length is equal to the number of
		 * Unicode code units in the string.
		 */
		
		System.out.println(s.name.charAt(2));
		// Returns the char value at the specified index. 
		//An index ranges from 0 to length() - 1.

		System.out.println(s.name.compareTo(s.name1));
		// Compares two strings lexicographically.

		System.out.println(s.name.compareToIgnoreCase(s.name1));
		// Compares two strings lexicographically, ignoring case differences.

		System.out.println(s.name.contains(s.name1));
		// Returns true if and only if this string contains the specified sequence of
		// char values

		System.out.println(s.name.contentEquals(s.name));
		/*
		 * Compares this string to the specified CharSequence. The result is true if and
		 * only if this String represents the same sequence of char values as the
		 * specified sequence.
		 */

		System.out.println(s.name.endsWith("d"));
		// Tests if this string ends with the specified suffix.

		System.out.println(s.name.equals(s.name));
		/*
		 * Compares this string to the specified object. The result is true if and only
		 * if the argument is not null and is a String object that represents the same
		 * sequence of characters as this object.
		 */

		System.out.println(s.name.hashCode());
		// Returns a hash code for this string.

		System.out.println(s.name.indexOf("fbdh"));
		/*
		 * Returns the index within this string of the first occurrence of the specified
		 * substring.
		 */
		System.out.println(s.name.intern());
		// Returns a canonical representation for the string object.

		System.out.println(s.name.isBlank());
		// Returns true if the string is empty or contains
		// only white space codepoints,otherwise false.

		System.out.println(s.name.lastIndexOf(s.name1.length()));
		// Returns the index within this string of the last occurrence of
		// the specified character.

		System.out.println(s.name.lines());
		// output: java.util.stream.ReferencePipeline$Head@48cf768c
		// Returns a stream of lines extracted from this string,separated by line
		// terminators.

		System.out.println(s.name.matches(s.name1));
		// Tells whether or not this string matches the given regular expression.

		System.out.println(s.name.replaceAll(s.name, s.name1)); // ab
		System.out.println(s.name.replaceAll("AAA", s.name1)); // abcd
		// Replaces each substring of this string that matches the given regular
		// expression
		// with the given replacement

		System.out.println(s.name.replaceFirst(s.name, s.name1)); // ab
		System.out.println(s.name.replaceFirst("AAA", s.name1)); // abcd
		// Replaces the first substring of this string that matches the given regular
		// expression with the given replacement.

		System.out.println(s.name.startsWith("b")); // false
		System.out.println(s.name1.startsWith("a")); // true
		// Tests if this string starts with the specified prefix.

		System.out.println(s.name.strip()); // abcd
		System.out.println(s.name2.strip());
		// Returns a string whose value is this string,
		// with all leading and trailing white space removed.

		System.out.println(s.name2.stripIndent());
		// Returns a string whose value is this string, with incidental white space
		// removed from the beginning and end of every line.

		System.out.println(s.name.toCharArray());
		// Converts this string to a new character array

		System.out.println(s.name.toUpperCase()); // ABCD
		// Converts all of the characters in this String to uppercase using the rules of
		// the default locale
		System.out.println(s.name.toUpperCase().toLowerCase()); // abcd
		// Converts all of the characters in this String to lowercase using the rules of
		// the default locale

		System.out.println(s.name.toUpperCase().toString());
		// This object (which is already a string!) is itself returned

		System.out.println(s.name.translateEscapes());
		// Returns a string whose value is this string,
		// with escape sequencestranslated as if in a string literal.

		System.out.println(s.name2.trim()); // ab cd ef
		/*
		 * Returns a string whose value is this string, with all leadingand trailing
		 * space removed, where space is definedas any character whose code point is
		 * less than or equal to 'U+0020' (the space character).
		 */

		System.out.println(s.name.getBytes()); // [B@ba4d54
		// Encodes this String into a sequence of bytes using the platform's default
		// charset,
		// storing the result into a new byte array.

		System.out.println(s.name.getClass()); // class java.lang.String
		// Returns the runtime class of this Object

		System.out.println(s.name.split(s.name1)); // [Ljava.lang.String;@de0a01f
		// Splits this string around matches of the given regular expression

	}
}

