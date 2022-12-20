//Programming question:
//Write a program  to check the coupon code
// 
//1) coupon code must be 9 character
//2) first two characters must be uppercase 
//3) 4 digit must be a number and it represents the year (2022)
//4) remaining three digits represents the coupon series in that last character must be a  uppercase.
//
//Example:
//
//Input: CT202001S
//
//Output: Valid coupon

package com.bajaj.pulsar;

import java.util.Scanner;

public class CouponCode {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String coupon = sc.next();
		int count = 0;
		// EH202265D
		String str1 = coupon.substring(0, 2);
//		System.out.println(str1);
		String str2 = coupon.substring(2, 6);
//		System.out.println(str2);
		String str3 = coupon.substring(6, 9);
//		System.out.println(str3);

		int year = Integer.parseInt(str2);
//		int year = Integer.valueOf(str2);
//		System.out.println(year);
		System.out.println(str3.length());
		if (coupon.length() == 9 && year >= 2000 && year <= 2022) {
			if (str3.charAt(str3.length() - 1) >= 'A' && str3.charAt(str3.length() - 1) <= 'Z') {
				if (str1.charAt(0) >= 'A' && str1.charAt(0) <= 'Z') {
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("Invalid coupon");
		} else {
			System.out.println("Valid coupon");
		}

	}
}
