package com.capgemini.kantara.thing1.person;

public class Email {

	public String id;
	public String password;
	public long mobileNo;
	public Company company;

	public Email(String id, String password, long mobileNo) {
		super();
		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;
	}

	public void showOff() {
		System.out.println("=======Email======");
		System.out.println("id : " + id);
		System.out.println("password : " + password);
		System.out.println("mobileNo : " + mobileNo);
		if (company != null) {
			company.showOff();
		} else {
			System.out.println("Company is empty or not filled.");
		}
	}
}
