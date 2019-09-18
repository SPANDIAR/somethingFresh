package com.football.directory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class eplClub extends footballClub {
	static int numberOfClubs;
	private List<footballPlayer> playerDetails;
	
	public List<footballPlayer> getPlayerDetails() {
		return playerDetails;
	}

	public void setPlayerDetails(List<footballPlayer> playerDetails) {
		this.playerDetails = playerDetails;
	}
	
	public void setPlayerDetails(footballPlayer playerDetails) {
		this.playerDetails.add(playerDetails);
	}

	public eplClub() {
		// TODO Auto-generated constructor stub
		numberOfClubs++;
		this.setCountry("GBR");
		this.setRegion("Europe");
		this.setLeagueName("Barclay's Premier League");
		this.setLeagueDivision("I");
		playerDetails = new ArrayList<footballPlayer> ();
	}
	
	public static void main(String[] args) {
		
		String[] eplClubs = {"Arsenal", "Chelsea", "Manchester United", "Liverpool", "Manchester City", "Totenham Hotspurs"};
		String[] arsenalPlayersNames = {"Aubameyang", "Lacazette", "Granit Xhaka"};
		String[] arsenalPlayersPosition = {"Striker", "Striker", "Mid Fielder"};
		String[] chelseaPlayerNames = {"Tobby Abraham", "Willian", "Marcus Alonso"};
		String[] chelseaPlayersPosition = {"Striker", "Winger", "Defender"};
		
		List<eplClub> eplClubDetails = new ArrayList<eplClub>();
		//int iterateList=0;
		
		for (int i=0; i<eplClubs.length; i++) {
			eplClub clubDetails = new eplClub();
			clubDetails.setClubName(eplClubs[i]);
			
			// set values for some players in each club
			switch (eplClubs[i]) {
			
			case "Arsenal":
				// set Players for Arsenal
				for (int j=0;j<arsenalPlayersNames.length;j++) {
					
					footballPlayer player = new footballPlayer();
					player.setPlayerName(arsenalPlayersNames[j]);
					player.setPosition(arsenalPlayersPosition[j]);
					clubDetails.setPlayerDetails(player);
				}
				break;
				
			case "Chelsea":
				// set Players for Chelsea
				for (int j=0;j<chelseaPlayerNames.length;j++) {
					
					footballPlayer player = new footballPlayer();
					player.setPlayerName(chelseaPlayerNames[j]);
					player.setPosition(chelseaPlayersPosition[j]);
					clubDetails.setPlayerDetails(player);
				}
				
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
			
			// Iterate through the Player Details List
			for(footballPlayer player: clubDetailsInfo.getPlayerDetails()) {
			System.out.println("Name of the player is: " + player.getPlayerName());
			System.out.println("Position of the player is: " + player.getPosition());
			}
			
		}
	}

}
	
