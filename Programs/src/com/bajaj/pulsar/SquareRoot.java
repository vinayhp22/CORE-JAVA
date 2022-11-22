package com.bajaj.pulsar;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double n = sc.nextDouble();
		System.out.println(sqrt(n)); // 16

	}

	private static double sqrt(double num) {
		double temp;
		double sqrt = num / 2; // 16/2=8
		do {
			temp = sqrt; // 8 //5
			sqrt = (temp + num / temp) / 2; // (8+16/8)/2=5 //(5+16/5)/2=4.1

		} while ((temp - sqrt) != 0); // 8-5=3 //5-4.1=0.9
		return sqrt; //4.0
	}

}
