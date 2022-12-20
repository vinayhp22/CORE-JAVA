package com.xworkz.boot;

import java.util.Collection;
import java.util.LinkedList;

public class CouponRunner {

	public static void main(String[] args) {

		Collection collection = new LinkedList();
		collection.add("Amazon Coupons");
		collection.add("Flipkart Coupons");
		collection.add("Myntra Coupons");
		collection.add("Udemy Coupons");
		collection.add("Medibuddy Coupons");
		collection.add("Boat Coupons");
		collection.add("AJIO Coupons");
		collection.add("BigBascket Coupons");
		collection.add("GoIbibo Coupons");
		collection.add("Rapido Coupons");
		collection.add("Dell Coupons");
		collection.add("Google Coupons");
		collection.add("Apple Coupons");
		collection.add("Microsoft Coupons");
		System.out.println(collection.size());
		collection.clear();
		System.out.println(collection.size());

	}

}
