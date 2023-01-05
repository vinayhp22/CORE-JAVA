package com.streams.dto;

import java.io.Serializable;

public class DaughterDTO implements Comparable<DaughterDTO>, Serializable {

	private String name;
	private Long mobile;
	private Integer age;
	private Boolean single;
	private Boolean alive;

	public DaughterDTO() {
		// TODO Auto-generated constructor stub
	}

	public DaughterDTO(String name, Long mobile, Integer age, Boolean single, Boolean alive) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.age = age;
		this.single = single;
		this.alive = alive;
	}
	
	@Override
	public int compareTo(DaughterDTO dto) {
		return this.name.compareToIgnoreCase(dto.name);
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode overided........\n");
		return 22;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals overided........\n");
		if (obj != null) {
			if (obj instanceof DaughterDTO) {
				DaughterDTO dto = (DaughterDTO) obj;
				if (dto.name != null && dto.mobile != 0) {
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

	public Long getMobile() {
		return mobile;
	}

	public Integer getAge() {
		return age;
	}

	public Boolean isSingle() {
		return single;
	}

	public Boolean isAlive() {
		return alive;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setSingle(Boolean single) {
		this.single = single;
	}

	public void setAlive(Boolean alive) {
		this.alive = alive;
	}

}
