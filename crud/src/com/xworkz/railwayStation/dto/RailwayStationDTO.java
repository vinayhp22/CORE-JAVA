package com.xworkz.railwayStation.dto;

import java.time.LocalDateTime;
import com.xworkz.ipl.dto.AbstractAuditDTO;

public class RailwayStationDTO extends AbstractAuditDTO {

	private String name;
	private Integer noOfPlatforms;
	private String area;
	private Double platformTicketPrice;

	public RailwayStationDTO() {
		super();
	}

	public RailwayStationDTO(String name, Integer noOfPlatforms, String area, Double platformTicketPrice,
			String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		this.name = name;
		this.noOfPlatforms=noOfPlatforms;
		this.area=area;
		this.platformTicketPrice=platformTicketPrice;
	}

	@Override
	public String toString() {
		return "RailwayStationDTO [name=" + name + ", noOfPlatforms=" + noOfPlatforms + ", area=" + area
				+ ", platformTicketPrice=" + platformTicketPrice + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNoOfPlatforms() {
		return noOfPlatforms;
	}

	public void setNoOfPlatforms(Integer noOfPlatforms) {
		this.noOfPlatforms = noOfPlatforms;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Double getPlatformTicketPrice() {
		return platformTicketPrice;
	}

	public void setPlatformTicketPrice(Double platformTicketPrice) {
		this.platformTicketPrice = platformTicketPrice;
	}

}
