package com.xworkz.helmet.dto;

import java.time.LocalDateTime;
import com.xworkz.helmet.constant.Color;
import com.xworkz.helmet.constant.Type;
import com.xworkz.ipl.dto.AbstractAuditDTO;

public class HelmetDTO extends AbstractAuditDTO {

	private String brand;
	private Double price;
	private Color color;
	private Type type;

	public HelmetDTO() {
		super();
	}

	public HelmetDTO(String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate,
			String brand, Double price, Color color, Type type) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.type = type;
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

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
