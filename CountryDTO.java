package com.xworkz.hospitalapp.dto;

public class CountryDTO {
	private int countryId;
	private String countryName;
	private StateDTO states;
	
	public int getCountryId() {
		return countryId;
	}
	
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	
	public String getCountryName() {
		return countryName;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public StateDTO getState() {
		return states;
	}
	
	public void setStates(StateDTO states) {
		this.states = states;
	}
	
	
	@Override
	public String toString() {
	
		return "CountryDTO -[countryId "+this.countryId+",countryName "+this.countryId+",states  "+this.states+"]";
		
	}

	public StateDTO getStates() {
		// TODO Auto-generated method stub
		return null;
	}

	public StateDTO getState1() {
		// TODO Auto-generated method stub
		return null;
	}

		
	}

