package com.capgemini.kantara.thing1;

import com.capgemini.kantara.constants.PillarShape;

public class Pillar {
	public long id;
	public String place;
	public PillarShape shape = PillarShape.ROUND;
	public double height;
	public Company company = new Company("BMRCL", "Bangalore");

	public Pillar(long id, String place, double height) {
		this.id = id;
		this.place = place;
		this.height = height;

	}

	public void showOff() {

		System.out.println("id : " + id);
		System.out.println("place : " + place);
		System.out.println("SHAPE : " + shape);
		System.out.println("height : " + height);

		company.showOff();

	}

}
/*
 * id,place,shape:enum,height,supporting,company:custom showOff() Company:
 * name,type,showOff()
 */