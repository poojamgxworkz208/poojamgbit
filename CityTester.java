package com.xworkz.cityapp;

import java.util.*;
import com.xworkz.cityapp.dto.CompaniesDTO;


public class CityTester {
		
		public static void main(String ar[]) {
			System.out.println("look into company names one by one");
			@SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);
					int size= sc.nextInt();
			   City city = new City(size);
			
			for(int i=0;i<size;i++) {
				CompaniesDTO dto= new CompaniesDTO();
				
				System.out.println("Enter the comany details");
				System.out.println("enter the company name");
				
				String companiesName=sc.next();
				dto.setCompaniesName(companiesName);
				
				System.out.println("enter the Salary");
				int  companiesSalary=sc.nextInt();
				dto.setCompaniesSalary(companiesSalary);
				
				System.out.println("enter the place");
				String companiesPlace=sc.next();
				dto.setCompaniesPlace(companiesPlace);
				
				
				
				boolean isAdded= city.createCompanies(dto);
				System.out.println(isAdded);
				
			}
			city.getCompaniesByName("bgk");

		
		    city.updateCompaniesNameByPlace("bagalkot", "bgk");
			city.deleteCompaniesBySalary(40000);
	
}
}