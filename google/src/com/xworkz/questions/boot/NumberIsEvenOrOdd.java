package com.xworkz.questions.boot;

import java.util.Scanner;

public class NumberIsEvenOrOdd {

	public static void main(String[] args) {

		int x;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit");

		x = sc.nextInt();
		if (x % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
	}
}
