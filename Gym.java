package com.xworkz.gymapp;

import com.xworkz.gymapp.dto.EquipmentDTO;
public class Gym{
	
private static final Object equipmentName = null;
private EquipmentDTO[] equipment;
private int index;

public Gym(int size) {
	equipment = new EquipmentDTO[size];
}
public boolean createEquipment(EquipmentDTO equipment){
boolean EquipmentAdded=false;
System.out.println("inside createEquipment method");

if(equipment!=null){
	this.equipment[index++]=equipment;
	EquipmentAdded=true;
}
else {
	System.out.println("No Equipment added");
	return EquipmentAdded=false;
}
return EquipmentAdded;
}

public boolean updateEquipmentNoByEquipmentId(int EquipmentId,long EquipmentNo){
	System.out.println("inside the updateEquipmentNoByEquipmentId");
	boolean update=false;
	if(EquipmentId>0 && EquipmentNo>0){
		for(int i=0;i<equipment.length;i++){
			if(equipment[i].getequipmentId()== EquipmentId){
				System.out.println("Equipment Id is found now update the contact"+EquipmentId);
				equipment[i].setEquipmentNo(EquipmentNo);
				update=true;
			}
			else
				System.out.println("Equipment Id is found now update the contact");
				update=false;
		}
	}
	return update;
}

public EquipmentDTO getEquipmentByName(String EquipmentName){
	EquipmentDTO dto = null;
		if(EquipmentName!=null){
			for(int i=0;i<equipment.length;i++){
				if(equipment[i].getEquipmentName().equals(EquipmentName)){
					System.out.println("Equipment name is:"+EquipmentName);
			   dto=equipment[i];
				}
				else
				System.out.println("Equipment Name not found");
			}
		}
	return dto;
	}
	
	public EquipmentDTO getEquipmentById(int EquipmentId){
		EquipmentDTO dto = null;
		if(EquipmentId!=0){
			for(int i=0;i<equipment.length;i++){
				if(equipment[i].getEquipmentId() == EquipmentId){
					System.out.println("ElectronicGadgets Id is:"+EquipmentId);
					dto=equipment[i];
				}
				else
				System.out.println("EquipmentId not found");
			}
		}
	return dto;
	}
	
	public EquipmentDTO getEquipmentByNo(long EquipmentNo){
		EquipmentDTO dto = null;
			if(EquipmentNo!=0){
				for(int i=0;i<equipment.length;i++){
					if(equipment[i].getEquipmentNo()== EquipmentNo){
						System.out.println("Equipment Id is:"+EquipmentNo);
						dto=equipment[i];
					}
					else
					System.out.println("EquipmentNo not found");
				}
			}
		return dto;
		}
		
		public void getAllEquipmentDetails(){
			for(int i=0;i<equipment.length;i++){
				System.out.println(equipment[i]);
			}
		}
		
	}

	
