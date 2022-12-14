package com.xworkz.war.dto;

import java.sql.Date;
import java.time.LocalDate;

import com.xworkz.ipl.dto.AbstractAuditDTO;

public  class WarDTO extends AbstractAuditDTO{

	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private String startedBy;
	private String startedWith;
	private String wonBy;
	private int noOfDeaths;
	
	public WarDTO() {
		System.out.println("Running AbstractAuditDTO ");
	}
	
	public WarDTO(String name, LocalDate startDate, LocalDate endDate, String startedBy, String startedWith,
			String wonBy, int noOfDeaths, String createdBy, LocalDate) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startedBy = startedBy;
		this.startedWith = startedWith;
		this.wonBy = wonBy;
		this.noOfDeaths = noOfDeaths;
	}
	
	@Override
	public String toString() {
		return "WarDTO [name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", startedBy=" + startedBy
				+ ", startedWith=" + startedWith + ", wonBy=" + wonBy + ", noOfDeaths=" + noOfDeaths + ", toString()="
				+ super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getStartedBy() {
		return startedBy;
	}

	public void setStartedBy(String startedBy) {
		this.startedBy = startedBy;
	}

	public String getStartedWith() {
		return startedWith;
	}

	public void setStartedWith(String startedWith) {
		this.startedWith = startedWith;
	}

	public String getWonBy() {
		return wonBy;
	}

	public void setWonBy(String wonBy) {
		this.wonBy = wonBy;
	}

	public int getNoOfDeaths() {
		return noOfDeaths;
	}

	public void setNoOfDeaths(int noOfDeaths) {
		this.noOfDeaths = noOfDeaths;
	}
	
	

	




}
