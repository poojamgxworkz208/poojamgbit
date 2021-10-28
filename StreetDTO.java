package com.xworkz.hospitalapp.dto;

public class StreetDTO {
	private int streetId;
	private String streetName;
	private int streetNo;
	
	public int getStreetId() {
		return streetId;
	}
	
	public void setStreetId(int streetId) {
		this.streetId = streetId;
	}
	
	public String getStreetName() {
		return streetName;
	}
	
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getStreetNo() {
		return streetNo;
	}
	
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}
	
	@Override
	public String toString() {
	
		return "StreetDTO -[streetId  "+this.streetId+",streetName  "+this.streetName+",streetNo "+this.streetNo+"]";
		
	}
}


