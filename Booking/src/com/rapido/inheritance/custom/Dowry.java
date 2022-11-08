package com.rapido.inheritance.custom;

public class Dowry {

	public String act; // Dowry Prohibition Act
	public int year; // 1961
	public String occation;

	public Dowry(String act, int year, String occation) {
		super();
		this.act = act;
		this.year = year;
		this.occation = occation;
		System.out.println("Const : Dowry...");
	}

}
