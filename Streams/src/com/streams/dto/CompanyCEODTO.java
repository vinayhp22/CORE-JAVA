package com.streams.dto;

import java.io.Serializable;

public class CompanyCEODTO implements Serializable{

	private String name;
	private String company;
	private int age;
	private String country;
	private String qualifications;
	private boolean married;
	private DaughterDTO daughter;

	public CompanyCEODTO() {
		// TODO Auto-generated constructor stub
	}

	public CompanyCEODTO(String name, String company, int age, String country, String qualifications, boolean married,
			DaughterDTO daughter) {
		super();
		this.name = name;
		this.company = company;
		this.age = age;
		this.country = country;
		this.qualifications = qualifications;
		this.married = married;
		this.daughter = daughter;
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashCode overide in CompanyCEODTO...");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals overide in CompanyCEODTO");
		if(obj!=null) {
			if(obj instanceof CompanyCEODTO) {
				CompanyCEODTO ceodto=(CompanyCEODTO)obj;
				if(ceodto.name!=null) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "CompanyCEODTO [name=" + name + ", company=" + company + ", age=" + age + ", country=" + country
				+ ", qualifications=" + qualifications + ", married=" + married + ", daughter=" + daughter + "]";
	}

	public String getName() {
		return name;
	}

	public String getCompany() {
		return company;
	}

	public int getAge() {
		return age;
	}

	public String getCountry() {
		return country;
	}

	public String getQualifications() {
		return qualifications;
	}

	public boolean isMarried() {
		return married;
	}

	public DaughterDTO getDaughter() {
		return daughter;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public void setDaughter(DaughterDTO daughter) {
		this.daughter = daughter;
	}

}
