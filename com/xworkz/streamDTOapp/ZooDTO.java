package com.xworkz.streamDTOapp;

public class ZooDTO {
	private int id;
	private String name;
	private String stateName;
	private Integer ticketPrice;
		// TODO Auto-generated constructor stub

	public ZooDTO(int id, String name, String stateName, Integer ticketPrice) {
		super();
		this.id = id;
		this.name = name;
		this.stateName = stateName;
		this.ticketPrice = ticketPrice;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	public Integer getTicketPrice() {
		return ticketPrice;
	}
	public void setCost(Integer ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
		@Override
	public String toString() {
		return "ZooDTO [id= "+ id +"name=" + name + ", stateName = "+ stateName+" , ticketPrice="+ ticketPrice +"]";
	}
		public Object getModel() {
			// TODO Auto-generated method stub
			return null;
		}
}
