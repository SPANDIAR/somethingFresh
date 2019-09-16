package com.football.directory;

public class footballClub extends league{
	
	private String clubName;
	private String homeGround;
	private String nickName;
	private String city;
	private String season;
	

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public String getHomeGround() {
		return homeGround;
	}

	public void setHomeGround(String homeGround) {
		this.homeGround = homeGround;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public footballClub() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	public footballClub(String club, String ground, String alsoCalled, String location) {
		// TODO Auto-generated constructor stub
		
		/*this.setCountry("GBR");
		this.setRegion("Eurpoe");
		this.setLeagueName("Barclay's Premier League");
		this.setLeagueDivision("I");*/
		this.setClubName(club);
		this.setHomeGround(ground);
		this.setNickName(alsoCalled);
		this.setCity(location);
		this.setSeason("2019-2020");
		
	}

}
