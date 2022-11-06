/*Your function takes two arguments:

current father's age (years)
current age of his son (years)

Сalculate how many years ago the father was twice as old as his son 
(or in how many years he will be twice as old). 
The answer is always greater or equal to 0,
 no matter if it was in the past or it is in the future.
*/

package com.bajaj.pulsar;

import java.util.Scanner;

public class FatherSonAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dadYears = sc.nextInt();
		int sonYears = sc.nextInt();

		int dadYearsTemp = dadYears;
		int years = 0;
		int yearsAgo = 0;

		for (int i = 0; i <= dadYears; i++) {
			if (dadYearsTemp / 2 == sonYears) {
				years = dadYearsTemp;
				yearsAgo = dadYears - years;
				System.out.println(yearsAgo);
				return;
			} else if (sonYears * 2 > dadYears) {
				years = (sonYears * 2) - dadYears;
				System.out.println(years);
				return;
			}
			dadYearsTemp = dadYearsTemp - 1;
		}
	}
}
