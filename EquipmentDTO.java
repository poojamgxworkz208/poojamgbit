package com.xworkz.gymapp.dto;

public class EquipmentDTO {
	private int equipmentId;
	private String equipmentName;
	private long equipmentNo;
	
	public void EquipmentDTO(){
	System.out.println(this.getClass().getSimpleName()+"object is created");
	}
	
	public void setEquipmentId(int EquipmentId){
	this.equipmentId=EquipmentId;
	}
	
	public int getEquipmentId(){
		return equipmentId;
		}
	
	public void EquipmentName(String EquipmentName){
	this.equipmentName=EquipmentName;
	}
	
	public String getEquipmentName(){
	return equipmentName;
	}
	
	public void setEquipmentNo(long EquipmentNo){
	this.equipmentNo=EquipmentNo;
	}
	
	public long getEquipmentNo(){
	return equipmentNo;
	}
	
	
	@Override
	public String toString(){
	return "EquipmentDto - [EquipmentId= " +this.equipmentId+", EquipmentName= " +this.equipmentName+", EquipmentNo= " +this.equipmentNo+"]";
	}


public int getequipmentId() {
	// TODO Auto-generated method stub
	return 0;
}

public void setEquipmentNo11(long EquipmentNo) {
	// TODO Auto-generated method stub
	
}


}





