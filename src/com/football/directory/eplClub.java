package com.football.directory;

import java.util.ArrayList;
import java.util.Date;

public class eplClub extends footballClub {
	static int numberOfClubs;
	private String player;
	private String position;
	private int squadNumber;
	private String nationality;
	private Date DoB;
	
	

	public String getPlayer() {
		return player;
	}



	public void setPlayer(String player) {
		this.player = player;
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



	public void setSquadNumber(int i) {
		this.squadNumber = i;
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



	public eplClub() {
		// TODO Auto-generated constructor stub
		numberOfClubs++;
		this.setCountry("GBR");
		this.setRegion("Europe");
		this.setLeagueName("Barclay's Premier League");
		this.setLeagueDivision("I");
		
	}
	
	public static void main(String[] args) {
		
		String[] eplClubs = {"Arsenal", "Chelsea", "Manchester United", "Liverpool", "Manchester City", "Totenham Hotspurs"};
		String[] arsenalPlayers = {"Aubameyang", "Lacazette", "Granit Xhaka"};
		String[] chelseaPlayers = {"Tobby Abraham", "Willian", "Marcus Alonso"};
		ArrayList<eplClub> eplClubDetails = new ArrayList<eplClub>();
		int iterateList=0;
		
		for (int i=0; i<eplClubs.length; i++) {
			eplClub clubDetails = new eplClub();
			clubDetails.setClubName(eplClubs[i]);
			
			// set values for some players in each club
			switch (eplClubs[i]) {
			
			case "Arsenal":
				// set Striker for Arsenal
				clubDetails.setPlayer(arsenalPlayers[0]);
				clubDetails.setSquadNumber(14);
				clubDetails.setPosition("Striker");
				break;
				
			case "Chelsea":
				clubDetails.setPlayer(chelseaPlayers[0]);
				//clubDetails.setSquadNumber(14);
				clubDetails.setPosition("Striker");
				break;
				
			 default:
			
			}
			
			eplClubDetails.add(clubDetails);
		}
		
		System.out.println("Number of Clubs in the list is: " + eplClub.numberOfClubs);
		
		for (eplClub clubDetailsInfo:eplClubDetails) {
			//clubDetailsInfo = eplClubDetails.get(iterateList);
			System.out.println("\n");
			System.out.println("League is: " + clubDetailsInfo.getLeagueName());
			System.out.println("Country is: " + clubDetailsInfo.getCountry());
			System.out.println("Region is: " + clubDetailsInfo.getRegion());
			System.out.println("Name of the club is: " + clubDetailsInfo.getClubName());
			System.out.println("Name of player is: " + clubDetailsInfo.getPlayer());
			//iterateList++;
		}
	}

}
	
