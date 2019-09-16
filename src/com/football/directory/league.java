package com.football.directory;

// Base class of the Football Directory

public class league {
	
	private String leagueName;
	private String leagueDivision;
	private String country;
	private String region;
	
	
	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getLeagueDivision() {
		return leagueDivision;
	}

	public void setLeagueDivision(String leagueDivision) {
		this.leagueDivision = leagueDivision;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public league() {
		// TODO Auto-generated constructor stub
	}
	
	public league(String league, String division, String country, String region) {
		// TODO Auto-generated constructor stub
		
		this.setLeagueName(league);
		this.setLeagueDivision(division);
		this.setCountry(country);
		this.setRegion(region);
		
	}

}
