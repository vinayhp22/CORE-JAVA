package com.rapido.rider.boot;

import com.rapido.rider.things.helmet.Helmet;
import com.rapido.rider.things.helmet.HelmetModifier;

public class HelmetRunner {

	public static void main(String[] args) {
		Helmet helmet = new Helmet();
		HelmetModifier modifier = new HelmetModifier();
		modifier.useHelmet(helmet);
		System.out.println("Brand : " + helmet.getBrand());
		System.out.println("Type : " + helmet.getType());
		System.out.println("price : " + helmet.getPrice());
		System.out.println("Weight : " + helmet.getWeight());
		System.out.println("ManufacturedAt : " + helmet.getManufacturedAt());
		System.out.println("ManufacturedBy : " + helmet.getManufacturedBy());
		System.out.println("ManufacturedOn : " + helmet.getManufacturedOn());
		System.out.println("MarketedBy : " + helmet.getMarketedBy());
		System.out.println("HeadQuaters : " + helmet.getHeadQuaters());
		System.out.println("warrantyInYears : " + helmet.getWarrantyInYears());
		System.out.println("Email : " + helmet.getEmail());
	}

}
