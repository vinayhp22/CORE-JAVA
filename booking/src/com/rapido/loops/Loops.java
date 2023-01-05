package com.rapido.loops;

public class Loops {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("while loop");
		int i = 2;

		while (i < 10 && i % 2 == 0) {
			i = i + 2;
			System.out.println(i);
		}
		
		System.out.println("do-while loop");
		int k=2;
		do {
			k=k+2;
			System.out.println(k);
		} while (k%2==0 && k<10);
		System.out.println(" for loop");

		for (int j = 2; j % 2 == 0 && j<10; j=j+2) {
			System.out.println(j);
		}
	}
}
