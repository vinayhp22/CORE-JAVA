package com.capgemini.kantara.thing1;

public class Temple {

	public String name;
	public God god = new God("Maramma", "Female deity", "growth of the city");
	public String mainPriest;
	public int noOfVisitor;
	public double collectionPerDay;

	public Temple(String name, String mainPriest, int noOfVisitor, double collectionPerDay) {
		this.name = name;
		this.mainPriest = mainPriest;
		this.noOfVisitor = noOfVisitor;
		this.collectionPerDay = collectionPerDay;
	}

	public void showoff() {
		System.out.println("Temple running...");
		System.out.println("name : " + name);
		System.out.println("mainPriest : " + mainPriest);
		System.out.println("noOfVisitor : " + noOfVisitor);
		System.out.println("collectionPerDay : " + collectionPerDay);
		System.out.println(System.lineSeparator());
		if (god != null) {
			god.showOff();
		} else {
			System.out.println("God is null");
		}

	}

}
