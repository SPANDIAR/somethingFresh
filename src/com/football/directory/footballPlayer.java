package com.football.directory;

import java.util.Date;

public class footballPlayer {
	
	private String playerName;
	private String position;
	private int squadNumber;
	private String nationality;
	private Date DoB;
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String player) {
		this.playerName = player;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSquadNumber() {
		return squadNumber;
	}
	public void setSquadNumber(int squadNumber) {
		this.squadNumber = squadNumber;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Date getDoB() {
		return DoB;
	}
	public void setDoB(Date doB) {
		DoB = doB;
	}

	public footballPlayer() {
		// TODO Auto-generated constructor stub
	}
	
	

}
