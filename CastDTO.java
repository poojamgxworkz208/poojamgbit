package com.xworkz.movieapp.dto;

public class CastDTO {
	private int castId;
	private String castName;
	private long castNo;
	
	public void CastDTO(){
	System.out.println(this.getClass().getSimpleName()+"object is created");
	}
	
	public void setCastId(int CastId){
	this.castId=CastId;
	}
	
	public int getCastId(){
		return castId;
		}
	
	public void CastName(String CastName){
	this.castName=CastName;
	}
	
	public String getCastName(){
	return castName;
	}
	
	public void setCastNo(long CastNo){
	this.castNo=CastNo;
	}
	
	public long getCastNo(){
	return castNo;
	}
	
	
	@Override
	public String toString(){
	return "CastDto - [CastId= " +this.castId+", CastName= " +this.castName+", CastNo= " +this.castNo+"]";
	}


public int getequipmentId() {
	// TODO Auto-generated method stub
	return 0;
}

public void setEquipmentNo11(long EquipmentNo) {
	// TODO Auto-generated method stub
	
}


}





