package com.rapido.overRiding.child.humanResource;

import com.rapido.overRiding.custom.HumanResource;

public class Akshara extends HumanResource{

	@Override //@-Annotation to check Override in compile time
	public void hire() {
		// TODO Auto-generated method stub
		System.out.println("hire from child");
		super.hire();
		System.out.println("Running hire from Akshara");
	}
	

}
