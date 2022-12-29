package com.collection.dto;

import com.collection.constant.GameType;
import com.xworkz.sanitizer.dto.AbstractAuditDTO;

public class GameDTO extends AbstractAuditDTO {

	private String name;
	private GameType type;
	private Integer noOfPlayers;

	public GameDTO(String name, GameType type, Integer noOfPlayers) {
		super();
		this.name = name;
		this.type = type;
		this.noOfPlayers = noOfPlayers;
	}

	@Override
	public String toString() {
		return "GameDTO [name=" + name + ", type=" + type + ", noOfPlayers=" + noOfPlayers + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals ");
		if (obj != null) {
			if (obj instanceof GameDTO) {
				GameDTO dto = (GameDTO) obj;
				if (dto.name.equals(this.name)) {
					System.out.println("Name is matching : " + dto.name);
					return true;
				}
				if (dto.type.equals(this.type)) {
					System.out.println("Type is matching : " + dto.type);
					return true;
				}
				if (dto.noOfPlayers.equals(this.noOfPlayers)) {
					System.out.println("NoOfPlayers is matching : " + dto.noOfPlayers);
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GameType getType() {
		return type;
	}

	public void setType(GameType type) {
		this.type = type;
	}

	public Integer getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(Integer noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

}
