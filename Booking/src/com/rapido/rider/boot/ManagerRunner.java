package com.rapido.rider.boot;

import com.rapido.rider.things.manager.*;

public class ManagerRunner {

	public static void main(String[] args) {

		Manager manager = new Manager();
		Product product = new Product();
		manager.useProduct(product);
		System.out.println("Name : " + product.getName());
		System.out.println("Brand : " + product.getBrand());
		System.out.println("Type : " + product.getType());
		System.out.println("Email : " + product.getEmail());
		System.out.println("Weight : " + product.getWeight());
		System.out.println("ManufacturedAt : " + product.getManufacturedAt());
		System.out.println("ManufacturedBy : " + product.getManufacturedBy());
		System.out.println("ManufacturedOn : " + product.getManufacturedOn());
		System.out.println("MarketedBy : " + product.getMarketedBy());
		System.out.println("HeadQuaters : " + product.getHeadQuaters());
		System.out.println("BestBeforeInMounths : " + product.getBestBeforeInMounths());
	}

}
