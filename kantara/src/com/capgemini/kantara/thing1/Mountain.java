package com.capgemini.kantara.thing1;

public class Mountain {

	public String name;
	public Location location = new Location("Tumkur main road", "Madhugiri", "Karnataka", 572133, "India");
	public double height;
	public Temple temple= new Temple("Maramma temple, Madhugiri", null, 500, 500006);

	public Mountain(String name, double height) {
		this.name = name;
		this.height = height;
	}

	public void showOff() {
		System.out.println("Mountain running..... ");
		System.out.println("name : " + name);
		System.out.println("height : " + height + System.lineSeparator());

		location.showOff();
		System.out.println(System.lineSeparator());
		temple.showoff();
	}

}
/*
 * Mountain: name,location:custom,height,temple:custom showOff() Location:
 * street,city,state,pincode,country Temple:
 * name,god:custom,mainPriest,noOfVisitor,collectionPerDay God : name, gender,
 * mainPower,weapon:custom showOff() Weapon: name,use,weight showOff
 */