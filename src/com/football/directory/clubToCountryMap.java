package com.football.directory;

import java.util.HashMap;
import java.util.Map;

public class clubToCountryMap {
	
	private HashMap <String, String> clubCountryMap;
	static String premierLeagueCountry = "GBR";
	static String laLigaCountry = "ESP";
	static String serieACountry = "ITA";
	static String bundesLigaCountry = "DEU";

	public clubToCountryMap() {
		// TODO Auto-generated constructor stub
		clubCountryMap = new HashMap <String, String> ();
	}
	
	public HashMap<String, String> getClubCountryMap() {
		return clubCountryMap;
	}

	public void setClubCountryMap(HashMap<String, String> clubCountryMap) {
		this.clubCountryMap = clubCountryMap;
	}
	
	public void setClubCountryMap(String club, String country) {
		//this.clubCountryMap = clubCountryMap;
		this.clubCountryMap.put(club, country);
	}
	
	public void loadPremierLeagueClubs(String[] premierLeagueClubs) {
		for (int i=0; i<premierLeagueClubs.length;i++) {
			// Add the premier league clubs to the HashMap
			this.setClubCountryMap(premierLeagueClubs[i], clubToCountryMap.premierLeagueCountry);
		}	
	}
	
	public void loadLaLigaClubs(String[] laLigaClubs) {
		for (int i=0; i<laLigaClubs.length;i++) {
			// Add the premier league clubs to the HashMap
			this.setClubCountryMap(laLigaClubs[i], clubToCountryMap.laLigaCountry);
		}	
	}
	
	public void loadserieAClubs(String[] serieAClubs) {
		for (int i=0; i<serieAClubs.length;i++) {
			// Add the premier league clubs to the HashMap
			this.setClubCountryMap(serieAClubs[i], clubToCountryMap.serieACountry);
		}	
	}
	
	public void loadBundesLigaClubs(String[] bundesLigaClubs) {
		for (int i=0; i<bundesLigaClubs.length;i++) {
			// Add the premier league clubs to the HashMap
			this.setClubCountryMap(bundesLigaClubs[i], clubToCountryMap.bundesLigaCountry);
		}	
	}
	
	public void printClubCountryMap() {
		
		System.out.println("Shown below are the Clubs to Country Mapping");
		System.out.println("Size of the Mapping is: " + this.clubCountryMap.size());
		
		for (Map.Entry<String, String> entryMap:this.clubCountryMap.entrySet()) {
			
			System.out.println("ClubName is: " + entryMap.getKey());
			System.out.println("Club is in Country: " + entryMap.getValue());
			
		}
		
	}

	public static void main (String args[]) {
		
		String[] premierLeagueClubs = {"Arsenal", "Chelsea", "Manchester United", "Manchester City", "Liverpool"};
		String[] laLigaClubs = {"Barcelona", "Real Madrid", "Athletico Madrid", "Valencia", "Sevilla"};
		String[] serieAClubs = {"Juventus", "AC Milan", "Inter Milan", "Roma", "Napoli"};
		String[] bundesLigaClubs = {"Bayern Munich", "Borussia Dortmund", "Stuttgart", "Hamburg", "Werder Bremen"};
		
		clubToCountryMap countryMap = new clubToCountryMap();
		countryMap.loadPremierLeagueClubs(premierLeagueClubs);
		countryMap.loadLaLigaClubs(laLigaClubs);
		countryMap.loadserieAClubs(serieAClubs);
		countryMap.loadBundesLigaClubs(bundesLigaClubs);
		
		countryMap.printClubCountryMap();
		
		}
		
	}


