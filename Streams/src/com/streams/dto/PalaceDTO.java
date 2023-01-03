package com.streams.dto;

public class PalaceDTO {

	private String name;
	private String location;
	private String buildBy;
	private boolean destroyed;
	private double visitingFee;

	public PalaceDTO() {
		// TODO Auto-generated constructor stub
	}

	public PalaceDTO(String name, String location, String buildBy, boolean destroyed, double visitingFee) {
		super();
		this.name = name;
		this.location = location;
		this.buildBy = buildBy;
		this.destroyed = destroyed;
		this.visitingFee = visitingFee;
	}

	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", location=" + location + ", buildBy=" + buildBy + ", destroyed="
				+ destroyed + ", visitingFee=" + visitingFee + "]";
	}
	
	@Override
	public int hashCode() {
		System.out.println("hashCode overided..........\n");
		return 22;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals overided.............\n");
		if (obj!=null) {
			if (obj instanceof PalaceDTO) {
				PalaceDTO dto = (PalaceDTO)obj;
				if (dto.name!=null && location!=null) {
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public String getBuildBy() {
		return buildBy;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public double getVisitingFee() {
		return visitingFee;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setBuildBy(String buildBy) {
		this.buildBy = buildBy;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public void setVisitingFee(double visitingFee) {
		this.visitingFee = visitingFee;
	}

}
