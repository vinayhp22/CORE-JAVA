package com.xworkz.questions.boot;

import java.util.Scanner;

public class AddWithoutPlusOperator {
	public static void main(String[] args) {
		int no1;
		int no2;
		int add;
		
	   
		Scanner sc = new Scanner(System.in);
	    
	     System.out.println("Enter Two numbers");
	     no1 = sc.nextInt();
	     no2 = sc.nextInt();
	     add=no1-(-no2);
	     System.out.println("Addition is : "+add);
	}
}
