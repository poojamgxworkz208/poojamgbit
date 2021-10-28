package com.xworkz.hospitalapp.hospital;

	import java.util.*;

	import com.xworkz.hospitalapp.dto.AddressDTO;
	import com.xworkz.hospitalapp.dto.AreaDTO;
	import com.xworkz.hospitalapp.dto.CountryDTO;
	import com.xworkz.hospitalapp.dto.DistrictDTO;
	import com.xworkz.hospitalapp.dto.PatientDTO;
	import com.xworkz.hospitalapp.dto.StateDTO;
	import com.xworkz.hospitalapp.dto.StreetDTO;

	class HospitalTester{

		private static Scanner sc;

		public static void main(String ar[]){
			System.out.println("How many no of Patients");
			sc = new Scanner(System.in);
			int size = sc.nextInt();
		Hospital hospital = new Hospital();
			
			for(int i=0;i<size;i++){
			PatientDTO dto = new PatientDTO();
			
			    System.out.println("Enter the Patient Details");
			    
				System.out.println("Enter the PatientID");
					int patientId = sc.nextInt();
					dto.setPatientId(patientId);
					
				System.out.println("Enter the PatientName");
					String patientName = sc.next();
					dto.setPatientName(patientName);
					
				System.out.println("Enter the Patient BloodGroup");
					String patientBloodGroup = sc.next();
					dto.setBloodGroup(patientBloodGroup);
					
				System.out.println("Enter the Age");
					int patientAge = sc.nextInt();
					dto.setAge(patientAge);
					
				System.out.println("Enter the ContactNo");
					long patientContactNo = sc.nextLong();
					dto.setContactNo(patientContactNo);
					
				System.out.println("Enter the Gender");
					String gender = sc.next();
					dto.setGender(gender);
			
					
				AddressDTO dto1=new AddressDTO();
					
					System.out.println("Enter the addressId");
						int addressId=sc.nextInt();
						dto1.setAddressId(addressId);
							
					System.out.println("Enter the addressName");
						String addressName=sc.next();
						dto1.setAddressName(addressName);
							
						
					System.out.println("Enter the CountryDTO");
					
					
				CountryDTO dto2 = new CountryDTO();
					
					System.out.println("Enter the CountryId");
						int countryId = sc.nextInt();
						dto2.setCountryId(countryId);
						
					System.out.println("Enter the Country Name");
						String countryName=sc.next();
						dto2.setCountryName(countryName);	
						
					System.out.println("Enter the StateDTO");
					
				StateDTO dto3 = new StateDTO();
					
					System.out.println("Enter the State Id");
						int stateId = sc.nextInt();
						dto3.setStateId(stateId);

					System.out.println("Enter the State Name");
						String districtName=sc.next();
						dto3.setStateName(districtName);
						
					System.out.println("Enter the DistrictDTO");
					
				DistrictDTO dto4 = new DistrictDTO();
					
					System.out.println("Enter the District Id");
						int districtId = sc.nextInt();
						dto4.setDistrictId(districtId);
						
					System.out.println("Enter the District Name");
						String districtName1=sc.next();
						dto4.setDistrictName(districtName1);
						
					System.out.println("Enter the AreasDTO");
					
				AreaDTO dto5 = new AreaDTO();
					
					System.out.println("Enter the Area Id");
						int areaId= sc.nextInt();
						dto5.setAreaId(areaId);
						
					System.out.println("Enter the Area Name");
						String areaName=sc.next();
						dto5.setAreaName(areaName);
						
					System.out.println("Enter the StreetDTO");
					
				StreetDTO dto6= new StreetDTO();
					
					System.out.println("Enter the Street Id");
						int streetId=sc.nextInt();
						dto6.setStreetId(streetId);
						
					System.out.println("Enter the Street Name");
						String streetName=sc.next();
						dto6.setStreetName(streetName);
						
					System.out.println("Enter the Street No");
						int streetNo=sc.nextInt();
						dto6.setStreetNo(streetNo);	
						
				dto.setAddress(dto1);
				dto1
				.setCountries(dto2);
				dto2.setStates(dto3);
				dto3.setDistricts(dto4);
				dto4.setAreas(dto5);
				dto5.setStreets(dto6);
				
					
					
			boolean isadded = hospital.createPatient(dto);
			System.out.println(isadded);
			
			}
			
			hospital.getPatientByName("Teju");
			hospital.getPatientById(1);
			hospital.getPatientByNo(8147);
			//hospital.getPatientByAddress("Kengeri");
			hospital.getPatientByAge(20);
			hospital.getPatientByBloodGroup("b+");
			hospital.getPatientByGender("Female");
			
			hospital.getAllPatientDetails();
			
			hospital.updatePatientContactNoByPatientId(1,29008762); 
			hospital.getAllPatientDetails();
			
			System.out.println("Enter the Street No to search the patient");
			int id= sc.nextInt();
			System.out.println(hospital.getPatientByStreetNo(id));	
			
			hospital.getAllPatientDetails();
			
			
			}
			
			
		
		
		
		
	}


