package com.streams.dto;

import java.io.Serializable;
import java.time.Year;

import com.streams.constants.WeaponType;

public class WeaponDTO implements Serializable, Comparable<WeaponDTO> {

	private String name;
	private String madeBy;
	private Year madeOn;
	private Double price;
	private WeaponType type;

	public WeaponDTO() {
		// TODO Auto-generated constructor stub
	}

	public WeaponDTO(String name, String madeBy, Year madeOn, Double price, WeaponType type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}

	@Override
	public int compareTo(WeaponDTO dto) {
		return dto.name.compareTo(this.name);
	}

	@Override
	public int hashCode() {
		return 22;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof WeaponDTO) {
				WeaponDTO dto = (WeaponDTO)obj;
				if(this.name.equals(dto.name)) {
					return true;
				}
				if(this.madeBy.equals(dto.madeBy)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}

	public String getName() {
		return name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public Year getMadeOn() {
		return madeOn;
	}

	public Double getPrice() {
		return price;
	}

	public WeaponType getType() {
		return type;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public void setMadeOn(Year madeOn) {
		this.madeOn = madeOn;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setType(WeaponType type) {
		this.type = type;
	}

}
