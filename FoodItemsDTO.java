package com.xworkz.hotelapp.dto;

public class FoodItemsDTO {
	
	public FoodItemsDTO() {
		System.out.println("Item object is created");
	}
	
	private int itemId;
	private String itemName;
	

	public void setItemId(int itemId) {
		this.itemId=itemId;
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemName(String itemName) {
		this.itemName=itemName;
		
	}
	public String getItemName1() {
		 return itemName;
	
	}
	@Override
	public String toString() {
	return"FoodItemsDTO---{Id="+itemId+",Name="+itemName+"}";
			
	}

	public Object getItemName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

