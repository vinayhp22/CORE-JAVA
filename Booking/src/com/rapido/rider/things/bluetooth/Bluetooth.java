package com.rapido.rider.things.bluetooth;

public class Bluetooth {

	private String brand;
	private String type;
	private int batteryBackUpHours;
	private String email;
	private double weight;
	private String manufacturedAt;
	private String manufacturedBy;
	private String manufacturedOn;
	private String marketedBy;
	private String headQuaters;
	private int warrantyInYears;

	void setBrand(String brand) {
		this.brand = brand;
	}

	void setType(String type) {
		this.type = type;
	}

	void setBatteryBackUpHours(int batteryBackUpHours) {
		this.batteryBackUpHours = batteryBackUpHours;
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

	void setWarrantyInYears(int warrantyInYears) {
		this.warrantyInYears = warrantyInYears;
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public int getBatteryBackUpHours() {
		return batteryBackUpHours;
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

	public int getWarrantyInYears() {
		return warrantyInYears;
	}

}
