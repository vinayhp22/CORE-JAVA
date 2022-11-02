package com.capgemini.kantara.thing1.person;

public class Job {

	public double salary;
	public String role;
	public String bond;
	public Company company;

	public Job(double salary, String role, String bond, Company company) {
		this.salary = salary;
		this.role = role;
		this.bond = bond;
		this.company = company;
	}

	public void showOff() {
		System.out.println("=======Job======");
		System.out.println("salary : " + salary);
		System.out.println("role : " + role);
		System.out.println("bond : " + bond);
		if (company != null) {
			company.showOff();
		} else {
			System.out.println("Company is empty or not filled.");
		}
	}
}
