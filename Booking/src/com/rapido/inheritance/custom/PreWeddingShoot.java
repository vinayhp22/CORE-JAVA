package com.rapido.inheritance.custom;

public class PreWeddingShoot {

	public double budget;
	public String location;
	public int days;

	public PreWeddingShoot(double budget, String location, int days) {
		super();
		this.budget = budget;
		this.location = location;
		this.days = days;
		System.out.println("Const : PreWeddingShoot");
	}

}
