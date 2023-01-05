package com.rapido.inheritance.custom;

public class Catering {

	public String name;
	public double exp;
	public int cookers;
	
	public Catering(String name, double exp, int cookers) {
		super();
		this.name = name;
		this.exp = exp;
		this.cookers = cookers;
		System.out.println("Const : Catering...");
	}
	
	
}
