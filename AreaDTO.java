package com.xworkz.hospitalapp.dto;

public class AreaDTO {
	private int areaId;
	private String areaName;
	private StreetDTO streets;
	
	public int getAreaId() {
		return areaId;
	}
	
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	
	public String getAreaName() {
		return areaName;
	}
	
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	public StreetDTO getStreets1() {
		return streets;
	}
	
	public void setStreets(StreetDTO streets) {
		this.streets = streets;
	}
	
	@Override
	public String toString() {
	
		return "AreaDTO -[areaId - "+this.areaId+",areaName - "+this.areaId+",streets - "+this.streets+"]";
		
	}

	public StreetDTO getStreets() {
		// TODO Auto-generated method stub
		return null;
	}
}
