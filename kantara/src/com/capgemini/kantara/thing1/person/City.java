package com.capgemini.kantara.thing1.person;

public class City {

	public String name;
	public long population;
	public String localGovt;
	public String localGovtType;

	public City(String name, long population, String localGovt, String localGovtType) {
		this.name = name;
		this.population = population;
		this.localGovt = localGovt;
		this.localGovtType = localGovtType;
	}

	public void showOff() {
		System.out.println("========City======");
		System.out.println("name : " + this.name);
		System.out.println("population : " + this.population);
		System.out.println("localGovt : " + this.localGovt);
		System.out.println("localGovtType : " + this.localGovtType);
	}
}
