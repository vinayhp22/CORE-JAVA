/*write a program:-

"Jack really likes his number five: the trick here is that you have to multiply each number by 5 raised to the number of digits of each numbers, so, for example:
multiply(3)==15 // 3 * 5¹
multiply(10)==250 // 10 * 5²
multiply(200)==25000 // 200 * 5³
multiply(0)==0 // 0 * 5¹"
*/

package com.bajaj.pulsar;

import java.util.*;

public class MultipleOf5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 1;
		int numberofdigits = numberofdigits(n); // 2
		for (int i = 0; i < numberofdigits; i++) {
			result = result * 5; // 1*5=5 ---> 5*5=25
		}
		System.out.println(result * n); // 25*10=250
	}

	public static int numberofdigits(int n) {
		int count = 0;
		do {
			count++;
			n = n / 10; // 10/10=1 ---> 1/10=0.1
		} while (n != 0);
		return count;

	}
}
