package com.rapido.rider.things.manager;

public class Product {
	private String name;
	private String brand;
	private String type;
	private String email;
	private double weight;
	private String manufacturedAt;
	private String manufacturedBy;
	private String manufacturedOn;
	private String marketedBy;
	private String headQuaters;
	private int bestBeforeInMounths;

	void setName(String name) {
		this.name = name;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	void setType(String type) {
		this.type = type;
	}

	void setEmail(String email) {
		this.email = email;
	}

	void setWeight(double weight) {
		this.weight = weight;
	}

	void setManufacturedAt(String manufacturedAt) {
		this.manufacturedAt = manufacturedAt;
	}

	void setManufacturedBy(String manufacturedBy) {
		this.manufacturedBy = manufacturedBy;
	}

	void setManufacturedOn(String manufacturedOn) {
		this.manufacturedOn = manufacturedOn;
	}

	void setMarketedBy(String marketedBy) {
		this.marketedBy = marketedBy;
	}

	void setHeadQuaters(String headQuaters) {
		this.headQuaters = headQuaters;
	}

	void setBestBeforeInMounths(int bestBeforeInMounths) {
		this.bestBeforeInMounths = bestBeforeInMounths;
	}

	public String getName() {
		return this.name;
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public String getEmail() {
		return email;
	}

	public double getWeight() {
		return weight;
	}

	public String getManufacturedAt() {
		return manufacturedAt;
	}

	public String getManufacturedBy() {
		return manufacturedBy;
	}

	public String getManufacturedOn() {
		return manufacturedOn;
	}

	public String getMarketedBy() {
		return marketedBy;
	}

	public String getHeadQuaters() {
		return headQuaters;
	}

	public int getBestBeforeInMounths() {
		return bestBeforeInMounths;
	}

}
