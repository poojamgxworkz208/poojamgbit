package com.xworkz.javaequalsapp;

import java.io.Serializable;
import java.util.Objects;

public class CompanyDTO implements Serializable{

	private Integer id;
	private String name;
	private String ceoName;
	private Double turnOver;
	
	public CompanyDTO() {
		super();
	}
	
	public CompanyDTO(Integer id, String name, String ceoName, Double turnOver) {
		super();
		this.id = id;
		this.name = name;
		this.ceoName = ceoName;
		this.turnOver = turnOver;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			if(obj instanceof CompanyDTO) {
				CompanyDTO dto = (CompanyDTO) obj;
				if(this.getName().equals(dto.getName())) {
					System.out.println("Company name same " + getName());
					return true;
				}else {
					return false;
				}
			}
		}
		return true;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCeoName() {
		return ceoName;
	}

	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}

	public Double getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(Double turnOver) {
		this.turnOver = turnOver;
	}

	@Override
	public String toString() {
		return "CompanyDTO [id=" + id + ", name=" + name + ", ceoName=" + ceoName + ", turnOver=" + turnOver + "]";
	}
	
}