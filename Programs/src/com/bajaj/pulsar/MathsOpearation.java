/*"Your task is to create a function that does four
 *  basic mathematical operations.
 *  The function should take three arguments - 
 *  operation(string/char), value1(number), value2(number).
 *  The function should return result of numbers after applying
 *   the chosen operation.('+', 4, 7) --> 11
 *   ('-', 15, 18) --> -3
 *   ('*', 5, 5) --> 25 
 *   ('/', 49, 7) --> 7"
 */
package com.bajaj.pulsar;

import java.util.Scanner;

public class MathsOpearation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a math operator");
		String operator = sc.next();
		System.out.println("Enter two numbers...");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int result;

		if (operator != null) {
			if (operator == "+") {
				result = n1 + n2;
				System.out.println(result);
			} else if (operator == "-") {
				result = n1 - n2;
				System.out.println(result);
			} else if (operator == "*") {
				result = n1 * n2;
				System.out.println(result);
			} else if (operator == "/") {
				result = n1 / n2;
				System.out.println(result);
			}
		} else {
			System.out.println("Operator is null...");
		}

		System.out.println("The end...");

	}

}
