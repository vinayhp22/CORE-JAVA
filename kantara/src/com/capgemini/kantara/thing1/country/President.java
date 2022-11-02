package com.capgemini.kantara.thing1.country;

import com.capgemini.kantara.constants.Gender;

public class President {

	public String name;
	public int tenure = 5;
	public Gender gender;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void showOff() {
		System.out.println("President running...");
		System.out.println("name : " + this.name);
		System.out.println("tenure : " + this.tenure);
		System.out.println("gender : " + this.gender);
	}

}
