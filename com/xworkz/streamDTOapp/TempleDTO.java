package com.xworkz.streamDTOapp;

public class TempleDTO {
	private int id;
	private String name;
	private String location;
	private String mainGod;
	private Integer Visitors;
	public TempleDTO() {
		// TODO Auto-generated constructor stub
	}
	public TempleDTO(int id, String name, String location, String MainGod, int visitors) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.mainGod = mainGod;
		this.Visitors = visitors;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMainGod() {
		return mainGod;
	}
	public void setType(String mainGod) {
		this.mainGod = mainGod;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getVisitors() {
		return Visitors;
	}
	public void setRatings(Integer visitors) {
		this.Visitors = visitors;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "TempleDTO [name=" + name + ", mainGod=" +mainGod + ", location=" + location + ", visitors=" + Visitors + ", id="
				+ id + "]";
	}

}
