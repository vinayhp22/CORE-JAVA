package com.xworkz.sanitizer.dto;

import java.time.LocalDateTime;

import com.xworkz.sanitizer.constant.Color;

public class SanitizerDTO extends AbstractAuditDTO {

	private String id;
	private String brand;
	private Double price;
	private Color color;

	public SanitizerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SanitizerDTO(String id, String brand, Double price, Color color) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "SanitizerDTO \n [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color
				+ ", toString()=" + super.toString() + "] \n";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
