package com.capgemini.kantara.thing1;

public class Brand {

	public String name;
	public String gstNo;
	public String location;
	public int rating;

	
	
	public Brand(String name, String gstNo, String location, int rating) {
		this.name = name;
		this.gstNo = gstNo;
		this.location = location;
		this.rating = rating;
	}



	public void showOff() {
		System.out.println("name : " + name);
		System.out.println("gstNo : " + gstNo);
		System.out.println("location : " + location);
		System.out.println("rating : " + rating + "  out of 5");
	}

}
