//Sum using Collection
package com.bajaj.pulsar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class SumUsingCollection {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Collection<Integer> addition = new ArrayList<Integer>();
		System.out.println("Size of Collection: \n");
		int size = sc.nextInt();
		System.out.println("Enter the integers: \n");
		for (int i = 0; i < size; i++) {
			addition.add(sc.nextInt());
		}
		System.out.println(addition);
		int sum = 0;
		for (int temp : addition) {
			sum += temp;
		}
		System.out.println(sum);
	}
}
