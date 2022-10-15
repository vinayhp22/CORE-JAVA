package com.xworkz.questions.boot;

import java.util.Scanner;

public class CountTheDightInAnNumber {

	public static void main(String[] args) {
		int x;
		int count=0;
		
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
		x= sc.nextInt();
		while (x!=0) {
			x=x/10; //600!=0 [1] : 600/10=60  [2]  : 60/10=6 [3]: 6/10=.6 !!!!
			count++;
		}
		System.out.println("Total digits are "+count);
	}

}
