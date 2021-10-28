package com.xworkz.hospitalapp.dto;

public class AddressDTO {

		private int addressId;
		private String addressName;
		private CountryDTO countries;
		
		public int getAddressId() {
			return addressId;
		}
		public String getAddressName() {
			return addressName;
		}
		
		public void setAddressId(int addressId) {
			this.addressId = addressId;
		}
		
		public void setAddressName(String addressName) {
			this.addressName = addressName;
		}
		
		public CountryDTO getCountries() {
			return countries;
		}
		
		public void setCountries(CountryDTO countries) {
			this.countries = countries;
		}
		
		@Override
		public String toString() {
		
			return "AddressDTO -[addressId - "+this.addressId+",addressName - "+this.addressName+",countries - "+this.countries+"]";
			
		}
	}

		

