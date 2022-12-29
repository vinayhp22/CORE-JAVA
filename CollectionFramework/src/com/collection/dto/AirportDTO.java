package com.collection.dto;

import com.xworkz.sanitizer.dto.AbstractAuditDTO;

public class AirportDTO extends AbstractAuditDTO {

	private String name;
	private String location;
	private String code;
	private String country;

	public AirportDTO() {
		// TODO Auto-generated constructor stub
	}

	public AirportDTO(String name, String location, String code, String country) {
		super();
		this.name = name;
		this.location = location;
		this.code = code;
		this.country = country;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals() airportDTO");
		if (obj != null) {
			if (obj instanceof AirportDTO) {
				AirportDTO dto = (AirportDTO) obj;
				if (dto.name.equals(this.name)) {
					System.out.println("Name is matching : " + dto.name);
					return true;
				}
				if (dto.location.equals(this.location)) {
					System.out.println("Location is matching : " + dto.location);
					return true;
				}
				if (dto.code.equals(this.code)) {
					System.out.println("Code is matching : " + dto.code);
					return true;
				}
				if (dto.country.equals(this.country)) {
					System.out.println("Country is matching : " + dto.country);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "airportDTO [name=" + name + ", location=" + location + ", code=" + code + ", toString()="
				+ super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
