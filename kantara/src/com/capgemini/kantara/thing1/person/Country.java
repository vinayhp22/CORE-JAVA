package com.capgemini.kantara.thing1.person;

public class Country {
	public String name;
	public long code;
	public String nationalAnthem;
	public String typeOfGovt;

	/**
	 * @param name
	 * @param code
	 * @param nationalAnthem
	 * @param typeOfGovt
	 */
	public Country(String name, long code, String nationalAnthem, String typeOfGovt) {
		this.name = name;
		this.code = code;
		this.nationalAnthem = nationalAnthem;
		this.typeOfGovt = typeOfGovt;
	}

	public void showOff() {
		System.out.println("=======Country======");
		System.out.println("name : " + this.name);
		System.out.println("code : " + this.code);
		System.out.println("nationalAnthem : " + this.nationalAnthem);
		System.out.println("typeOfGovt : " + this.typeOfGovt);

	}
}
