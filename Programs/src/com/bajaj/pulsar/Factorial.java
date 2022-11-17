package com.bajaj.pulsar;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int num, fact=1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number..");
		num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+ " is "+fact);
	}

}
