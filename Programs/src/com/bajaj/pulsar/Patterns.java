package com.bajaj.pulsar;

public class Patterns {

	public static void main(String[] args) {
		
		    /* RIGHT ANGLED TRIANGLE
			$
		   $$
		  $$$
		 $$$$
		 */
		System.out.println("RIGHT ANGLED TRIANGLE");
		int n = 4;

		for (int i = 1; i <= n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("$");
			}
			System.out.println("");
		}
		System.out.println(System.lineSeparator());
		System.out.println("====================");
		System.out.println(System.lineSeparator());
		/* EQUILATERAL TRIANGLE
		    $ 
		   $ $ 
		  $ $ $ 
		 $ $ $ $ 
		 */
		System.out.println("EQUILATERAL TRIANGLE");
		int n1 = 4;

		for (int i = 1; i <= n1; i++) {
			for (int j = n1 - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("$ ");
			}
			System.out.println("");
		}
		System.out.println(System.lineSeparator());
		System.out.println("====================");
		System.out.println(System.lineSeparator());
		
		/* rows values
   		 1
  		22
 	   333
      4444
		*/
		System.out.println("Rows values");
		int n2 = 4;

		for (int i = 1; i <= n2; i++) {
			for (int j = n2 - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("====================");
		System.out.println(System.lineSeparator());
		    /* Columns values
			1
		   12
		  123
		 1234
		 */
		System.out.println("Columns values");
		int n3 = 4;

		for (int i = 1; i <= n3; i++) {
			for (int j = n3 - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println("");
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("====================");
		System.out.println(System.lineSeparator());
		/* SQUARE PATTERN
		3211
		3212
		3123
		1234
		*/
		System.out.println("SQUARE PATTERN");
		int n4 = 4;

		for (int i = 1; i <= n4; i++) {
			for (int j = n4 - 1; j >= i; j--) {
				System.out.print(j);
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println("");
		}
		
		
		
		System.out.println(System.lineSeparator());
		System.out.println("====================");
		System.out.println(System.lineSeparator());
		/*
		3Vinay11 
		3Vinay1Vinay 
		31Vinay3 
		1Vinay34
		*/
		System.out.println("SQUARE PATTERN with replacing 2 by a word..");
		int n5 = 4;

		for (int i = 1; i <= n5; i++) {
			for (int j = n5 - 1; j >= i; j--) {
				if (j == 2) {
					System.out.print("Vinay");
				} else {
					System.out.print(j);
				}
			}
			for (int k = 1; k <= i; k++) {
				if (k == 2) {
					System.out.print("Vinay");
				} else {
					System.out.print(k);
				}
			}
			System.out.println(" ");
		}

		System.out.println(System.lineSeparator());
		System.out.println("====================");
		System.out.println(System.lineSeparator());
		/*
		$$$$ 
		$$$  
		$$   
		$
		*/
		System.out.println("REVERSED RIGHT ANGLED TRIANGLE");
		int n6 = 4;

		for (int i = 1; i <= n6; i++) {
			for (int j = n6; j >= i; j--) {
				System.out.print("$");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println(System.lineSeparator());
		System.out.println("====================");
		System.out.println(System.lineSeparator());
		/*
		  123456
		   12345
		    1234
		     123
		      12
		*/
		System.out.println("REVERSED RIGHT ANGLED TRIANGLE with column values");
		int n7 = 7;

		for (int i = n7-1; i >1; i--) {
			for (int j = n7; j >= i; j--) {
				System.out.print( " ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println("");
		}
		System.out.println(System.lineSeparator());
		System.out.println("====================");
		System.out.println(System.lineSeparator());
		/*
		 666666
		   55555
		    4444
		     333
		      22
		     */ 
		System.out.println("REVERSED RIGHT ANGLED TRIANGLE with row values");
		int n8 = 7;

		for (int i = n8 - 1; i > 1; i--) {
			for (int j = n8; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println("");
		}

	}

}
