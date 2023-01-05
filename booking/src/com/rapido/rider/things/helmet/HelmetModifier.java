package com.rapido.rider.things.helmet;

public class HelmetModifier {

	public Helmet helmet;

	public void useHelmet(Helmet helmet) {
		helmet.setBrand("SMK");
		helmet.setType("Full face helmet");
		helmet.setPrice(4893);
		helmet.setWeight(550);
		helmet.setManufacturedAt("Haryana");
		helmet.setManufacturedBy("SRK helmets pvt ltd");
		helmet.setManufacturedOn("Sept 2022");
		helmet.setMarketedBy("SRK marketing team");
		helmet.setHeadQuaters("DELHI");
		helmet.setWarrantyInYears(2);
		helmet.setEmail("care@srkhelmets.com");
	}
}
