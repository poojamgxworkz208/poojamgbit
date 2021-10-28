package com.xworkz.hospitalapp.hospital;

	import com.xworkz.hospitalapp.dto.AddressDTO;
	import com.xworkz.hospitalapp.dto.AreaDTO;
	import com.xworkz.hospitalapp.dto.CountryDTO;
	import com.xworkz.hospitalapp.dto.DistrictDTO;
	import com.xworkz.hospitalapp.dto.PatientDTO;
	import com.xworkz.hospitalapp.dto.StateDTO;
	import com.xworkz.hospitalapp.dto.StreetDTO;

	public class Hospital {

		private PatientDTO[] patients;
		private int index;
		
		public void Hospital1(int size){
			patients = new PatientDTO[size];
		}
			
		public boolean createPatient(PatientDTO patients){
		boolean patientAdded=false;
		System.out.println("inside createPatient method");
			
			if(patients!=null){
				this.patients[index++]=patients;
				patientAdded=true;
			}
			else{
				System.out.println("No patient is added");
				return patientAdded=false;
			}
		
		return patientAdded;
		}
				
		
		public boolean updatePatientContactNoByPatientId(int patientId,long contactNo){
			System.out.println("inside the updatePatientContactNoByPatientId");
			boolean update=false;
			if(patientId>0 && contactNo>0){
				for(int i=0;i<patients.length;i++){
					if(patients[i].getPatientId()== patientId){
						System.out.println("Patient Id is found now update the contact"+patientId);
						patients[i].setContactNo(contactNo);
						update=true;
					}
					else
						System.out.println("Patient Id is found now update the contact");
						update=false;
				}
			}
			return update;
		}
		

		
		public PatientDTO getPatientByName(String patientName){
		PatientDTO dto = null;
			if(patientName!=null){
				for(int i=0;i<patients.length;i++){
					if(patients[i].getPatientName().equals(patientName)){
						System.out.println("Patient name is:"+patientName);
				   dto=patients[i];
					}
					else
					System.out.println("Patient Name not found");
				}
			}
		return dto;
		}
		
		public PatientDTO getPatientById(int patientId){
		PatientDTO dto = null;
			if(patientId!=0){
				for(int i=0;i<patients.length;i++){
					if(patients[i].getPatientId() == patientId){
						System.out.println("Patient Id is:"+patientId);
						dto=patients[i];
					}
					else
					System.out.println("PatientId not found");
				}
			}
		return dto;
		}
		
		public PatientDTO getPatientByNo(long contactNo){
		PatientDTO dto = null;
			if(contactNo!=0){
				for(int i=0;i<patients.length;i++){
					if(patients[i].getContactNo()== contactNo){
						System.out.println("Patient Id is:"+contactNo);
						dto=patients[i];
					}
					else
					System.out.println("PatientContactNo not found");
				}
			}
		return dto;
		}
		
		public PatientDTO getPatientByAddress(AddressDTO address){
		PatientDTO dto = null;
			if(address!=null){
				for(int i=0;i<patients.length;i++){
					if(patients[i].getAddress().equals(address)){
						System.out.println("Patient Id is:"+address);
						dto=patients[i];
					}
					else
					System.out.println("PatientAddress not found");
				}
			}
		return dto;
		}
		
		public PatientDTO getPatientByBloodGroup(String bloodGroup){
		PatientDTO dto = null;
			if(bloodGroup!=null){
				for(int i=0;i<patients.length;i++){
					if(patients[i].getBloodGroup().equals(bloodGroup)){
						System.out.println("Patient Id is:"+bloodGroup);
						dto=patients[i];
					}
					else
					System.out.println("Patient BloodGroup not found");
				}
			}
		return dto;
		}
		
		public PatientDTO getPatientByAge(int age){
		PatientDTO dto = null;
			if(age!=0){
				for(int i=0;i<patients.length;i++){
					if(patients[i].getAge()==age){
						System.out.println("Patient Id is:"+age);
						dto=patients[i];
					}
					else
					System.out.println("Patient age not found");
				}
			}
		return dto;
		}
		
		public PatientDTO getPatientByGender(String gender){
		PatientDTO dto = null;
			if(gender!=null){
				for(int i=0;i<patients.length;i++){
					if(patients[i].getGender().equals(gender)){
						System.out.println("Patient Id is:"+gender);
						dto=patients[i];
					}
					else
					System.out.println("Patient gender not found");
				}
			}
		return dto;
		}
		
		public PatientDTO getPatientByStreetNo(int streetNo){
			PatientDTO dto = null;
				if(streetNo!=0){
					for(int i=0;i<patients.length;i++){
						
						PatientDTO patient=patients[i];
						AddressDTO address=patient.getAddress();
						CountryDTO country=address.getCountries();
						StateDTO state=country.getStates();
						DistrictDTO district=state.getDistricts();
						AreaDTO area=district.getAreas();
						StreetDTO street=area.getStreets();
						if(street.getStreetNo()==streetNo){
							System.out.println("Patient Id is:"+streetNo);
							dto=patients[i];
						}
						else
						System.out.println("PatientAddress not found");
					}
				}
			return dto;
			}
		
		public void getAllPatientDetails(){
			for(int i=0;i<patients.length;i++){
				System.out.println(patients[i]);
			}
		}
		
	}

