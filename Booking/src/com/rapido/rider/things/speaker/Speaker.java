package com.rapido.rider.things.speaker;

public class Speaker {
	private String brand;
	private String type;
	private String intelligentAssistant;
	private double weight;
	private double size;
	private String manufacturedBy;
	private String manufacturedOn;
	private String marketedBy;
	private String headQuaters;
	private int warrantyInYears;
	private String powerSource;

	void setBrand(String brand) {
		this.brand = brand;
	}

	void setType(String type) {
		this.type = type;
	}

	void setIntelligentAssistant(String intelligentAssistant) {
		this.intelligentAssistant = intelligentAssistant;
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

	void setPowerSource(String powerSource) {
		this.powerSource = powerSource;
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public String getIntelligentAssistant() {
		return intelligentAssistant;
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

	public String getPowerSource() {
		return powerSource;
	}
}
