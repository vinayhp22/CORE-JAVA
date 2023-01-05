package com.rapido.rider.boot;

import com.rapido.rider.things.jam.Jam;
import com.rapido.rider.things.jam.JamModifier;

public class JamRunner {

	public static void main(String[] args) {

		Jam jam = new Jam();
		JamModifier modifier = new JamModifier();
		modifier.useJam(jam);
		System.out.println("Brand : " + jam.getBrand());
		System.out.println("Type : " + jam.getType());
		System.out.println("ModelName : " + jam.getModelName());
		System.out.println("Weight : " + jam.getQuantity());
		System.out.println("FoodPreference : " + jam.getFoodPreference());
		System.out.println("ManufacturedBy : " + jam.getManufacturedBy());
		System.out.println("ManufacturedOn : " + jam.getManufacturedOn());
		System.out.println("MarketedBy : " + jam.getMarketedBy());
		System.out.println("ContainerType : " + jam.getContainerType());
		System.out.println("MaxShelfLife : " + jam.getMaxShelfLife());

	}

}
