package com.bajaj.pulsar;

public class ReverseANumber {

	public static void main(String[] args) {

		int num = 123456789;
		int mod = 0, rev = 0, count = 0;

		// Reverse A number
		while (num > 0) {
			mod = num % 10;
			rev = rev * 10 + mod;
			num = num / 10;
			count++;
		}
		System.out.println("No. of digits : "+count);
		System.out.println("Reverse :" + rev);

		// Sum of a number
		int num1 = 123456789, sum = 0;
		while (num1 > 0) {
			mod = num1 % 10;
			sum = sum + mod;
			num1 = num1 / 10;
		}
		System.out.println("SUM : " + sum);

	}

}
