package com.streams.dto;

public class DaughterDTO {

	private String name;
	private long mobile;
	private int age;
	private boolean single;
	private boolean alive;

	public DaughterDTO() {
		// TODO Auto-generated constructor stub
	}

	public DaughterDTO(String name, long mobile, int age, boolean single, boolean alive) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.age = age;
		this.single = single;
		this.alive = alive;
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode overided........\n");
		return 22;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals overided........\n");
		if (obj!=null) {
			if(obj instanceof DaughterDTO) {
				DaughterDTO dto = (DaughterDTO)obj;
				if (dto.name!=null && dto.mobile!=0) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "DaughterDTO [name=" + name + ", mobile=" + mobile + ", age=" + age + ", single=" + single + ", alive="
				+ alive + "]";
	}

	public String getName() {
		return name;
	}

	public long getMobile() {
		return mobile;
	}

	public int getAge() {
		return age;
	}

	public boolean isSingle() {
		return single;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSingle(boolean single) {
		this.single = single;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

}
