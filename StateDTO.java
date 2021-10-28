package com.xworkz.hospitalapp.dto;

public class StateDTO {
	private int stateId;
	private String stateName;
	private DistrictDTO districts;
	
	public int getStateId() {
		return stateId;
	}
	
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	
	public String getStateName() {
		return stateName;
	}
	
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	public DistrictDTO getDistricts1() {
		return districts;
	}

	public void setDistricts(DistrictDTO districts) {
		this.districts = districts;
	}

	@Override
	public String toString() {
	
		return "DistrictDTO -[stateId - "+this.stateId+",stateName - "+this.stateName+",districts - "+this.districts+"]";
		
	}

	public DistrictDTO getDistricts() {
		// TODO Auto-generated method stub
		return null;
	}

	
}


