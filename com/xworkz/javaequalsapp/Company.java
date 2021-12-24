package com.xworkz.javaequalsapp;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import com.xworkz.javaequalsapp.CompanyDTO;

public class Company {

	public static void main(String[] args) {
		
		CompanyDTO dto = new CompanyDTO(1, "Amazon", "Jeff Bezos", 17690000.00);
		CompanyDTO dto1 = new CompanyDTO(2, "Apple", "Tim Cook", 3300000000.00);
		CompanyDTO dto2 = new CompanyDTO(3, "Cognizant", "Brian Humphries", 13890000000.00);
		CompanyDTO dto3 = new CompanyDTO(3, "Cognizant", "Brian Humphries", 13890000000.00);
		CompanyDTO dto4 = new CompanyDTO(4, "Cisco Systems", "Chuck Robbins", 5000000000.00);
		CompanyDTO dto5 = new CompanyDTO(5, "Dell", "Michael Dell",2000000000.00);
		CompanyDTO dto6 = new CompanyDTO(6, "Siemens", "Joe Kaeser", 140700000.00);
		
		Set<CompanyDTO> dtos = new LinkedHashSet<CompanyDTO>(); 
		dtos.add(dto1);
		dtos.add(dto2);
		dtos.add(dto3);
		dtos.add(dto4);
		dtos.add(dto5);
		dtos.add(dto6);
		dtos.add(dto);
		
		boolean b = dto2.equals(dto3);
		System.out.println(b);
	
		Optional<CompanyDTO> optional = dtos.stream().filter((w)->w.getTurnOver()>138900.00).findFirst();
		System.out.println(dtos.size());
		System.out.println(optional);
	}
}
