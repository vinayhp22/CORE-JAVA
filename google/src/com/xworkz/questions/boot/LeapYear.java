package com.xworkz.questions.boot;

public class LeapYear {

	public static void main(String[] args) {
		for (int year = 1600; year < 1709; year++) {
			//checking 1600-1708
	
		if (year % 400 == 0  ) {
			System.out.println("leap "+year );	
			}
		
		else if(year%100 ==0){
			System.out.println("not a leap year " +year);
		}
		
		else if(year%4 ==0){
			System.out.println("leaf year " +year);
		}
		
		else {
			System.out.println("not a leap year " +year);
		}
		
		
			}

		} 
}
	

