package com.xworkz.streamDTOapp;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RiverDTO implements Serializable {
	private int id;
	private String name;
	private String state;
	private Double length;
	private Integer noOfDams;
	public RiverDTO(int id, String name, String state, Double length, Integer noOfDams) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.length = length;
		this.noOfDams = noOfDams;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Double getLength() {
		return length;
	}
	public void setLength(Double length) {
		this.length = length;
	}
	public Integer getNoOfDams() {
		return noOfDams;
	}
	public void setNoOfDams(Integer noOfDams) {
		this.noOfDams = noOfDams;
	}
	@Override
	public String toString() {
		return "RiverDTO [id=" + id + ", name=" + name + ", state=" + state + ", length=" + length + ", noOfDams="
				+ noOfDams + "]";
	}

	
	
	
	
}

