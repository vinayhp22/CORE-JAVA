package com.rapido.rider.things.chocolate;

public class ChocolateModifier {

	public Chocolate chocolate;

	public void useChocolate(Chocolate chocolate) {

		chocolate.setBrand("Cadbury");
		chocolate.setType("Milk Chocolate");
		chocolate.setModelName("Dairy Milk Silk Chocolate");
		chocolate.setWeight(150);
		chocolate.setFoodPreference("vegitarian");
		chocolate.setManufacturedBy("Mondelez India Foods Private Limited, HP");
		chocolate.setManufacturedOn("July-2022");
		chocolate.setMarketedBy("Mondelez India Foods Private Limited, HP");
		chocolate.setLiked(true);
		chocolate.setMaxShelfLife(1);

	}
}
