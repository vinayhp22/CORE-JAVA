package com.streams.dto;

import java.io.Serializable;

public class ApplicationDTO implements Serializable {

	private String name;
	private double version;
	private boolean free;
	private String developedBy;
	private double price;

	public ApplicationDTO() {
		// TODO Auto-generated constructor stub
	}

	public ApplicationDTO(String name, double version, boolean free, String developedBy, double price) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.developedBy = developedBy;
		this.price = price;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", free=" + free + ", developedBy="
				+ developedBy + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if (obj instanceof ApplicationDTO) {
				ApplicationDTO dto =(ApplicationDTO)obj;
				if (dto.name!=null && dto.version!=0) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 22;
	}

	public String getName() {
		return name;
	}

	public double getVersion() {
		return version;
	}

	public boolean isfree() {
		return free;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public void setfree(boolean free) {
		this.free = free;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
