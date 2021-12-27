package com.mvc.beans;

import java.util.LinkedHashMap;

public class CustomerBean {
	private String firstName;
	private String lastName;
	private String email;
	private String mobilenumber;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favCuisine;
	private String[] assets;
	
	
	public CustomerBean() {
		countryOptions=new LinkedHashMap<String,String>();
		countryOptions.put("IND", "India");
		countryOptions.put("USA", "United States Of America");
		countryOptions.put("UK", "United Kingdom");
		countryOptions.put("AFG", "Afganisthan");
		countryOptions.put("PAK", "Pakistan");
		countryOptions.put("CHI", "China");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	public String[] getAssets() {
		return assets;
	}
	public void setAssets(String[] assets) {
		this.assets = assets;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}
	public String getFavCuisine() {
		return favCuisine;
	}
	

}
