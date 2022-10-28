package com.capgemini.kantara.thing1.mountain;

public class God {

	public String name;
	public String gender;
	public String mainPower;
	public Weapon weapon = new Weapon("Bhuu Chakra", "use enu antha Gotilla", 55.3);

	public God(String name, String gender, String mainPower) {
		this.name = name;
		this.gender = gender;
		this.mainPower = mainPower;
	}

	public void showOff() {
		System.out.println("God Running...");
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("mainPower : " + mainPower);
		System.out.println(System.lineSeparator());

		if (this.weapon != null) {
			weapon.showOff();
		} else {
			System.out.println("weapon is null");
		}
	}
}
