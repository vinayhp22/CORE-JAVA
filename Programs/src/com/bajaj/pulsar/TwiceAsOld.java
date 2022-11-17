/*
 * Your function takes two arguments:
 * current father's age (years)
 * current age of his son (years)
 * 
 * Сalculate how many years ago the father was twice as 
 * old as his son 
 * (or in how many years he will be twice as old).
 *  The answer is always greater or 
 * equal to 0, no matter if it was in the past 
 * or it is in the future.
 */
package com.bajaj.pulsar;

import java.util.Scanner;

public class TwiceAsOld {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter sonAge  :   ");
		int sonAge = sc.nextInt();

		System.out.print("Enter fatherAge  :  ");
		int fatherAge = sc.nextInt();

		int yearsAgo = 0, yearsAfter = 0;
		while (sonAge * 2 != fatherAge && fatherAge > 2 * sonAge) {
			yearsAgo++;
			fatherAge = fatherAge - 1;
		}
		while (sonAge * 2 != fatherAge && fatherAge < 2 * sonAge) {
			yearsAfter--;
			fatherAge = fatherAge + 1;
			yearsAgo = yearsAfter;
		}

		System.out.println(yearsAgo);

	}
}
