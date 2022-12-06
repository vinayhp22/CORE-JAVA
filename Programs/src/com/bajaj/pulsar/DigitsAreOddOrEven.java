package com.bajaj.pulsar;

public class DigitsAreOddOrEven {

	public static void main(String[] args) {
		int num = 12340, mod = 0;
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
		int mod1 = 0, rev = 0;
		while (num > 0) {
			mod1 = num % 10;
			rev = rev * 10 + mod1;
			num = num / 10;
		}
		while (rev >= 0) {
			mod = rev % 10;
			if (mod % 2 == 0) {
				System.out.println(mod + " is even");
				if (rev == 0) {
					break;
				}
			} else {
				System.out.println(mod + " is odd");
				if (rev == 0) {
					break;
				}
			}
			rev = rev / 10;

		}
	}
}
