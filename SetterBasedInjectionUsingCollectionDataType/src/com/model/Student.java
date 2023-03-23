package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	
	private List <String> cities;
	private Set <Long> mobiles;
	private Map <String,Integer> countrycode ;
	
	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	public Set<Long> getMobiles() {
		return mobiles;
	}
	public void setMobiles(Set<Long> mobiles) {
		this.mobiles = mobiles;
	}
	public Map<String, Integer> getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(Map<String, Integer> countrycode) {
		this.countrycode = countrycode;
	}
	
}
