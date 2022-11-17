package com.bajaj.pulsar;

import java.util.Scanner;

public class NumberIsEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer...");
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("The number : "+x+" is an even number...");
		}else {
			System.out.println("The number : "+x+" is an odd number...");
			
		}
		
	}

}
