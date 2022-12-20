package com.xworkz.theatre.dto;

import com.xworkz.ipl.dto.AbstractAuditDTO;
import com.xworkz.theatre.constant.Brand;

public class TheatreDTO extends AbstractAuditDTO {

	private Integer theatreId;
	private String name;
	private Brand brand;
	private Integer seats;

	public TheatreDTO(int theatreId, String name, Brand brand, int seats) {
		super();
		this.theatreId = theatreId;
		this.name = name;
		this.brand = brand;
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "TheatreDTO [theatreId=" + theatreId + ", name=" + name + ", brand=" + brand + ", seats=" + seats
				+ ", toString()=" + super.toString() + "]";
	}

	public Integer getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

}
