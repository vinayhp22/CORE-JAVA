package com.rapido.rider.things.shampoo;

public class Shampoo {

	private String brand;
	private String type;
	private String modelName;
	private double quantity;
	private String foodPreference;
	private String manufacturedBy;
	private String manufacturedOn;
	private String marketedBy;
	private String containerType;
	private int maxShelfLife;

	void setBrand(String brand) {
		this.brand = brand;
	}

	void setType(String type) {
		this.type = type;
	}

	void setModelName(String modelName) {
		this.modelName = modelName;
	}

	void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	void setFoodPreference(String foodPreference) {
		this.foodPreference = foodPreference;
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

	void setContainerType(String containerType) {
		this.containerType = containerType;
	}

	void setMaxShelfLife(int maxShelfLife) {
		this.maxShelfLife = maxShelfLife;
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public String getModelName() {
		return modelName;
	}

	public double getQuantity() {
		return quantity;
	}

	public String getFoodPreference() {
		return foodPreference;
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

	public String getContainerType() {
		return containerType;
	}

	public int getMaxShelfLife() {
		return maxShelfLife;
	}

}
