package com.xworkz.hospitalapp.dto;

public class PatientDTO {
		
		private int patientId;
		private String patientName;
		private long contactNo;
		private AddressDTO address;
		private String bloodGroup;
		private int age;
		private String gender;
		
		public PatientDTO(){
		System.out.println(this.getClass().getSimpleName()+"object is created");
		}
		
		public void setPatientId(int patientId){
		this.patientId=patientId;
		}
		
		public void setPatientName(String patientName){
		this.patientName=patientName;
		}
		
		public String getPatientName(){
		return patientName;
		}
		
		public void setContactNo1(long contactNo){
		this.contactNo=contactNo;
		}
		
		public long getContactNo(){
		return contactNo;
		}
		
		public void setAddress(AddressDTO address) {
			this.address = address;
		}
		
		public AddressDTO getAddress() {
			return address;
		}
		
		public void setBloodGroup(String bloodGroup){
		this.bloodGroup=bloodGroup;
		}
		
		public String getBloodGroup(){
		return bloodGroup;
		}
		
		public void setAge(int age){
		this.age= age;
		}
		
		public int getAge(){
		return age;
		}
		
		public void setGender(String gender){
		this.gender=gender;
		}
		
		public String getGender(){
		return gender;
		}
		
		@Override
		public String toString(){
		return "PatientDto - [patientId= " +this.patientId+", patientName= " +patientName+", contactNo= " +this.contactNo+", address= " +this.address+", bloodGroup= " +this.bloodGroup+",age= " +this.age+", gender= " +this.gender+"]";
		}
	

	public int getPatientId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setContactNo11(long contactNo) {
		// TODO Auto-generated method stub
		
	}

	public void setContactNo(long contactNo) {
		// TODO Auto-generated method stub
		
	}

	
	}

