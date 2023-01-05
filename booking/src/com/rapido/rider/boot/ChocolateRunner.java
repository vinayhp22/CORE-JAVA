package com.rapido.rider.boot;

import com.rapido.rider.things.chocolate.Chocolate;
import com.rapido.rider.things.chocolate.ChocolateModifier;

public class ChocolateRunner {

	public static void main(String[] args) {

		Chocolate chocolate = new Chocolate();
		ChocolateModifier modifier = new ChocolateModifier();
		modifier.useChocolate(chocolate);
		System.out.println("Brand : " + chocolate.getBrand());
		System.out.println("Type : " + chocolate.getType());
		System.out.println("ModelName : " + chocolate.getModelName());
		System.out.println("Weight : " + chocolate.getWeight());
		System.out.println("FoodPreference : " + chocolate.getFoodPreference());
		System.out.println("ManufacturedBy : " + chocolate.getManufacturedBy());
		System.out.println("ManufacturedOn : " + chocolate.getManufacturedOn());
		System.out.println("MarketedBy : " + chocolate.getMarketedBy());
		System.out.println("Liked : " + chocolate.getLiked());
		System.out.println("MaxShelfLife : " + chocolate.getMaxShelfLife());

	}

}
