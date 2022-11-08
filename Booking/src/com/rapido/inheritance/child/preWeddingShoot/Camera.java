package com.rapido.inheritance.child.preWeddingShoot;

import com.rapido.inheritance.custom.PreWeddingShoot;

public class Camera extends PreWeddingShoot {

	public String cameraName;

	public Camera(double budget, String location, int days) {
		super(budget, location, days);
		// TODO Auto-generated constructor stub
		System.out.println("Const : Camera.......");
	}

}
