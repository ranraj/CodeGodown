package com.ran.learn.eventmanager.to;

import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.JsonObject;
import com.ran.learn.eventmanager.entity.Place;

/**
 *
 * @author rdhanasekar
 */
@XmlRootElement
public class PlaceTO {

	private Long id;
	private String name;
	private String doorNumber;
	private String line1;
	private String line2;
	private String state;
	private String country;
	private String zipCode;
	private String phoneNumber;

	private GeoLocationTO geoLocationTO;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public GeoLocationTO getGeoLocation() {
		return geoLocationTO;
	}

	public void setGeoLocation(GeoLocationTO geoLocation) {
		this.geoLocationTO = geoLocation;
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

	public Place getPlaceTO() {
		Place place = new Place();
		place.setCountry(this.getCountry());
		place.setLine1(this.getLine1());
		place.setLine2(this.getLine2());
		place.setName(this.getName());
		place.setPhoneNumber(phoneNumber);
		place.setState(this.getState());
		place.setZipCode(this.zipCode);
		place.setGeoLocation(geoLocationTO.getGeoLocation());
		return place;
	}

	public PlaceTO fromJson(JsonObject jsonObject) {

		if (jsonObject.get("id") != null) {
			this.setId(jsonObject.get("id").getAsLong());
		}
		if (jsonObject.get("name") != null) {
			this.setName(jsonObject.get("name").getAsString());
		}
		if (jsonObject.get("line1") != null) {
			this.setLine1(jsonObject.get("line1").getAsString());
		}
		if (jsonObject.get("line2") != null) {
			this.setLine2(jsonObject.get("line2").getAsString());
		}
		if (jsonObject.get("phoneNumber") != null) {
			this.setPhoneNumber(jsonObject.get("phoneNumber").getAsString());
		}
		if (jsonObject.get("state") != null) {
			this.setState(jsonObject.get("state").getAsString());
		}
		if (jsonObject.get("zipCode") != null) {
			this.setZipCode(jsonObject.get("zipCode").getAsString());
		}
		if (jsonObject.get("geoLocation") != null) {
			JsonObject placeObject = jsonObject.get("geoLocation").getAsJsonObject();
			this.setGeoLocation(new GeoLocationTO().fromJson(placeObject));
		}
		return this;
	}
}
