package com.capgemini.kantara.thing1.person;

public class State {
	public String name;
	public long population;
	public String oldName;
	public String stateAnthem;

	/**
	 * @param name
	 * @param population
	 * @param oldName
	 * @param stateAnthem
	 */
	public State(String name, long population, String oldName, String stateAnthem) {
		this.name = name;
		this.population = population;
		this.oldName = oldName;
		this.stateAnthem = stateAnthem;
	}

	public void showOff() {
		System.out.println("======State=======");
		System.out.println("name : " + this.name);
		System.out.println("population : " + this.population);
		System.out.println("oldName : " + this.oldName);
		System.out.println("stateAnthem : " + this.stateAnthem);
	}
}
