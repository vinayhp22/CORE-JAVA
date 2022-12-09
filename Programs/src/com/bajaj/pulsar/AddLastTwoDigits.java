package com.bajaj.pulsar;

//import java.util.Scanner;

public class AddLastTwoDigits {

	public static void main(String[] args) {

		int num = 123456;
		// Scanner sc = new Scanner(System.in);
		// int num = sc.nextInt();
		int rev = 0, mod = 0, mod1 = 0;
		int count = 0, sum = 0;

		while (num > 0 & count < 2) {
			mod = num % 10; // 6 //5
			rev = rev * 10 + mod; // 6 //65
			num = num / 10; // 12345 //1234
			count++; // 1 //2
		}
		System.out.println("Module :" + mod); // 5
		System.out.println("Reverse of last two digits :" + rev);// 65
		System.out.println("Num after reversing :" + num);// 1234
		System.out.println("Count :" + count);// 2

		int temp = rev; // 65
		while (temp > 0) {
			mod1 = temp % 10; // 5 //6
			sum = sum + mod1; // 5 //11
			temp = temp / 10; // 6 //0
		}

		System.out.println("Sum of last two digits : " + sum); // 11

	}

}
