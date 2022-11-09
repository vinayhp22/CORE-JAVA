package com.rapido.overRiding.custom;

public class Satellite {

	public long distanceToEarth;
	public boolean naturalSatellite;

	public Satellite(long distanceToEarth, boolean naturalSatellite) {
		super();
		this.distanceToEarth = distanceToEarth;
		this.naturalSatellite = naturalSatellite;
	}

	public void display() {
		System.out.println(this.naturalSatellite);
		System.out.println(this.distanceToEarth);
	}
}
