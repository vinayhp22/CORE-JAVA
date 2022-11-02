package com.capgemini.kantara.thing1.person;

public class Person {

	public String name = "Sagar";
	public Email email;
	public Job job;

	public void showOff(Email email, Job job) {
		System.out.println("=======Person======");
		System.out.println("name : " + name);
		if (email != null) {
			email.showOff();
		} else {
			System.out.println("Email is empty or not filled.");
		}
		if (job != null) {
			job.showOff();
		} else {
			System.out.println("Job is empty or not filled.");

		}
	}
}
