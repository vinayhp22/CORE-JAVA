package com.rapido.rider.things.chocolate;

public class Chocolate {

	private String brand;
	private String type;
	private String modelName;
	private double weight;
	private String foodPreference;
	private String manufacturedBy;
	private String manufacturedOn;
	private String marketedBy;
	private boolean liked;
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

	void setWeight(double weight) {
		this.weight = weight;
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

	void setLiked(boolean liked) {
		this.liked = liked;
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

	public double getWeight() {
		return weight;
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

	public boolean getLiked() {
		return liked;
	}

	public int getMaxShelfLife() {
		return maxShelfLife;
	}

}
