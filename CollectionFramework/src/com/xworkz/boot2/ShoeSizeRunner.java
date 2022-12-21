package com.xworkz.boot2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSizeRunner {

	public static void main(String[] args) {
		Collection<Double> sizes = new ArrayList<Double>();
		sizes.add(new Double(1));
		sizes.add(1.5D);
		sizes.add(2D);
		sizes.add(2.5D);
		sizes.add(3D);
		sizes.add(3.5D);
		sizes.add(4D);
		sizes.add(5D);
		sizes.add(6D);
		sizes.add(7D);
		sizes.add(8D);
		sizes.add(9D);
		sizes.add(10D);
		sizes.add(11D);
		sizes.add(12D);
		
		System.out.println(sizes+"\n");
		
		for (Double size : sizes) {
			System.out.println(size);
		}
		System.out.println("\n Iterator=====> \n");
		
		Iterator<Double> size = sizes.iterator();
		while (size.hasNext()) {
			Double element = (Double) size.next();
			System.out.println(element);
		}
		

		
	}
}
