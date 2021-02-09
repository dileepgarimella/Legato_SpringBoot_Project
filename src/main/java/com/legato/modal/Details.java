package com.legato.modal;

public class Details {
	
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Details() {
		
	}
	private String city;
	@Override
	public String toString() {
		return "Details [name=" + name + ", city=" + city + "]";
	}
	public Details(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	

}
