package com.ivoyant.multipleInheritance.classes;

public abstract class Person {

	public String name;
	public int age;
	public double salary;
	public double height;
	public double weight;
	
	
	public Person(String name, int age, double salary, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.height = height;
		this.weight = weight;
	}

	public void eat() {
		System.out.println("Running eat");
	}
	
	public void sleep() {
		System.out.println("Running sleep");
	}
	
}
