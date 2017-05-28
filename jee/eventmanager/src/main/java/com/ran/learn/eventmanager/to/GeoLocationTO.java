package com.ran.learn.eventmanager.to;

import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.JsonObject;
import com.ran.learn.eventmanager.entity.GeoLocation;

/**
 *
 * @author rdhanasekar
 */
@XmlRootElement
public class GeoLocationTO {

	private Long id;
	private String latitude;
	private String longitude;

	private Set<PlaceTO> places;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Set<PlaceTO> getPlaces() {
		return places;
	}

	public void setPlaces(Set<PlaceTO> places) {
		this.places = places;
	}

	public GeoLocation getGeoLocation() {
		GeoLocation geoLocation = new GeoLocation();
		geoLocation.setLatitude(this.getLatitude());
		geoLocation.setLongitude(this.getLongitude());
		return geoLocation;
	}

	public GeoLocationTO fromJson(JsonObject jsonObject) {

		if (jsonObject.get("id") != null) {
			this.setId(jsonObject.get("id").getAsLong());
		}
		if (jsonObject.get("latitude") != null) {
			this.setLatitude(jsonObject.get("latitude").getAsString());
		}
		if (jsonObject.get("longitude") != null) {
			this.setLongitude(jsonObject.get("longitude").getAsString());
		}
		return this;
	}

	public StringBuffer toJson() {
		StringBuffer buffer = new StringBuffer();

		buffer = buffer.append("{");
		buffer = buffer.append("\"id\":\"").append(this.getId()).append("\",");
		buffer = buffer.append("\"latitude\":\"").append(this.getLatitude()).append("\",");
		buffer = buffer.append("\"longitude\":\"").append(this.getLongitude()).append("\"");
		buffer = buffer.append("}");
		return buffer;
	}

}
