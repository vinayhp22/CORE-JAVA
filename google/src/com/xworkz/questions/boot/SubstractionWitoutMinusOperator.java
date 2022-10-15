package com.xworkz.questions.boot;

import java.util.Scanner;

public class SubstractionWitoutMinusOperator {

	public static void main(String[] args) {

		int no1;
		int no2;
		int sub;
		

	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter two digits");
	     
	     no1 = sc.nextInt();
	     no2 = sc.nextInt();

		
		sub=no1+(~no2+1); //no1+2's complement of no2
		
		System.out.println("Substraction : "+sub);
		
	}

}
