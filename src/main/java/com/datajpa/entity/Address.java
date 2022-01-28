package com.datajpa.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@AttributeOverride(column = @Column(name="student_street"),name = "street")
public class Address {

	@Override
	public String toString() {
		return "Address [street=" + street + ", area=" + area + ", city=" + city + "]";
	}

	public Address(String street, String area, String city) {
		super();
		this.street = street;
		this.area = area;
		this.city = city;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}
	private String street;
	
	private String area;
	
	private String city;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
