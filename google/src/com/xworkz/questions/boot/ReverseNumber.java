package com.xworkz.questions.boot;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int a, b;
		int rNo = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number"); //1234
		a = sc.nextInt();
		while (a > 0) {
			b = a % 10; //b = 1234%10=4
			a = a / 10; //a = 1234/10=12
			rNo = (rNo * 10) + b; 
		}
		System.out.println("Reversed no. is :" + rNo);
	}

}
