package com.xworkz.cityapp.dto;

public class CompaniesDTO {
	
	private String companiesName;
	private int  companiesSalary ;
	private  String companiesPlace;
	
	
	 public CompaniesDTO(){
		System.out.println(this.getClass().getSimpleName()+"object is created");
		
		}


	public String getCompaniesName() {
		return companiesName;
	}


	public void setCompaniesName(String companiesName) {
		this.companiesName = companiesName;
	}


	public int getCompaniesSalary() {
		return companiesSalary;
	}


	public void setCompaniesSalary(int companiesSalary) {
		this.companiesSalary = companiesSalary;
	}


	public String getCompaniesPlace() {
		return companiesPlace;
	}


	public void setCompaniesPlace(String companiesPlace) {
		this.companiesPlace = companiesPlace;
	}


	@Override
	public String toString() {
		return "CompaniesDTO [companiesName=" + companiesName + ", companiesSalary=" + companiesSalary
				+ ", companiesPlace=" + companiesPlace + "]";
	}
	
}
