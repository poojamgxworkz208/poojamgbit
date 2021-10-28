package com.xworkz.hospitalapp.dto;

public class DistrictDTO {
	private int districtId;
	private String districtName;
	private AreaDTO areas;
	
	public int getDistrictId() {
		return districtId;
	}
	
	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}
	
	public String getDistrictName() {
		return districtName;
	}
	
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	
	public AreaDTO getAreas() {
		return areas;
	}
	
	public void setAreas(AreaDTO areas) {
		this.areas = areas;
	}
	
	@Override
	public String toString() {
	
		return "DistrictDTO -[districtId - "+this.districtId+",districtName - "+this.districtName+",areas - "+this.areas+"]";
		
	}
}

