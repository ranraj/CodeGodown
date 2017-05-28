package com.ran.learn.eventmanager.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.ran.learn.eventmanager.to.PlaceTO;

/**
 *
 * @author rdhanasekar
 */
@Entity
@Table(name = "place")
@NamedQueries({ @NamedQuery(name = "Place.findAll", query = "select e from Place e") })
public class Place extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private String doorNumber;
	private String line1;
	private String line2;
	private String state;
	private String country;
	private String zipCode;
	private String phoneNumber;

	@ManyToOne(cascade = CascadeType.ALL)
	private GeoLocation geoLocation;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public GeoLocation getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(GeoLocation geoLocation) {
		this.geoLocation = geoLocation;
	}

	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public PlaceTO getPlace() {
		PlaceTO place = new PlaceTO();
		place.setCountry(this.getCountry());
		place.setLine1(this.getLine1());
		place.setLine2(this.getLine2());
		place.setName(this.getName());
		place.setPhoneNumber(phoneNumber);
		place.setState(this.getState());
		place.setZipCode(this.zipCode);
		// place.setGeoLocation(this.geoLocation.getGeoLocationTO());
		return place;
	}

}
