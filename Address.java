package com.autowiringPractice;

public class Address {

	private String street;
	
	private String city;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		System.out.println("Setter method....");
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("Setter method....");
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
}
