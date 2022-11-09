package com.rapido.overRiding.custom;

public class Director {

	public String industry;
	public double expInYears;

	public Director(String industry, double expInYears) {
		super();
		this.industry = industry;
		this.expInYears = expInYears;
	}

	public void display() {
		System.out.println(this.industry);
		System.out.println(this.expInYears);
	}
}
