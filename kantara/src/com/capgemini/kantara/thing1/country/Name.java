package com.capgemini.kantara.thing1.country;

public class Name {

	public String currentName;
	public String oldName;
	public String futureName;

	public Name(String currentName, String oldName, String futureName) {
		this.currentName = currentName;
		this.oldName = oldName;
		this.futureName = futureName;
	}

	public void showOff() {
		System.out.println("City  Name running...");
		System.out.println("currentName : " + this.currentName);
		System.out.println("oldName : " + this.oldName);
		System.out.println("futureName : " + this.futureName);
		
	}
}
