package com.ivoyant.multipleInheritance.classes;

import com.ivoyant.multipleInheritance.interfaces.XworkzRule;

public class JavaTrainee extends Person implements XworkzRule{

	public JavaTrainee(String name, int age, double salary, double height, double weight) {
		super(name, age, salary, height, weight);
		System.out.println("Running Java trainee const");
	}

	public void training() {
		System.out.println("Running training");
	}
	
	public void executeProgram() {
		System.out.println("Running training");
	}

	@Override
	public boolean uploadedTask() {
		System.out.println("Overided uploadedTask");
		return true;
	}

	@Override
	public boolean completedProgram() {
		System.out.println("Overided completedProgram");
		return true;
	}
	
}
