package com.xworkz.streamdto.dto;

public class HeadPhoneDTO {
	private int id;
	private String brandName;
	private String type;
	private Double cost;
	public HeadPhoneDTO() {
		// TODO Auto-generated constructor stub
	}
	public HeadPhoneDTO(int id, String brandName, String type, double cost) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.type = type;
		this.cost = cost;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getbrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
		@Override
	public String toString() {
		return "HeadPhoneDTo [id= "+ id +"brandName=" + brandName + ", type=" + type + ",  cost=" + cost + "]";
	}
		public Object getModel() {
			// TODO Auto-generated method stub
			return null;
		}
		
}

