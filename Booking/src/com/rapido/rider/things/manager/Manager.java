package com.rapido.rider.things.manager;

public class Manager {
	public String name = "Vinay";
	public Product product;

	public void useProduct(Product product) {
		product.setName("Shoe");
		product.setBrand("PUMA");
		product.setType("Sports Shoe");
		product.setEmail("customercare.puma@gmail.com");
		product.setWeight(500);
		product.setManufacturedAt("Pune");
		product.setManufacturedBy("Puma India pvt ltd");
		product.setManufacturedOn("Aug 2022");
		product.setMarketedBy("Puma India pvt ltd");
		product.setHeadQuaters("Mumbai");
		product.setBestBeforeInMounths(12);
	}

}
