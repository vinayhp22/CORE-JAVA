package com.bajaj.pulsar;

import java.util.Iterator;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num, count = 0;
		;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number..");
		num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}

//logic2		

		System.out.println("Running logic 2");
		int pn = 2, ch = 0;
		if (num <= 1) {
			ch = 1;
		}
		while (pn <= num / 2) {
			if (num % pn == 0) {
				ch = 1;
				break;
			} else {
				pn++;
			}
		}
		if (ch == 0) {
			System.out.println(num + " is a prime");
		} else {
			System.out.println(num + " is not a prime");
		}
	}

}
