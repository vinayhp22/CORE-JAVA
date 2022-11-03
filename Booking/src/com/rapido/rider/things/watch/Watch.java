package com.rapido.rider.things.watch;

public class Watch {

	private String brand;
	private String type;
	private int batteryBackUpDays;
	private double weight;
	private double size;
	private String manufacturedBy;
	private String manufacturedOn;
	private String marketedBy;
	private String headQuaters;
	private int warrantyInYears;
	private String email;

	void setBrand(String brand) {
		this.brand = brand;
	}

	void setType(String type) {
		this.type = type;
	}

	void setBatteryBackUpDays(int batteryBackUpDays) {
		this.batteryBackUpDays = batteryBackUpDays;
	}

	void setWeight(double weight) {
		this.weight = weight;
	}

	void setSize(double size) {
		this.size = size;
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

	void setEmail(String email) {
		this.email = email;
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public int getBatteryBackUpDays() {
		return batteryBackUpDays;
	}

	public double getWeight() {
		return weight;
	}

	public double getSize() {
		return size;
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

	public String getEmail() {
		return email;
	}

}
