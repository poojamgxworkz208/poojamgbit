package com.xworkz.streamdto.dto;

public class CafeDTO {
	private int id;
	private String name;
	private String location;
	private String type;
	private float ratings;
	public CafeDTO() {
		// TODO Auto-generated constructor stub
	}
	public CafeDTO(int id, String name, String location, String type, float ratings) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.type = type;
		this.ratings = ratings;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "CafeDto [name=" + name + ", type=" + type + ", location=" + location + ", ratings=" + ratings + ", id="
				+ id + "]";
	}
}
