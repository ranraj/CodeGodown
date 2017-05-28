package com.ran.learn.eventmanager.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ran.learn.eventmanager.to.GeoLocationTO;

@Entity
@Table(name = "geo_location")
@NamedQueries({ @NamedQuery(name = "Place.findAll", query = "select e from Place e") })
public class GeoLocation extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String latitude;
	private String longitude;

	@OneToMany(mappedBy = "geoLocation", targetEntity = Place.class, cascade = CascadeType.ALL)
	private Set<Place> places;

	public Set<Place> getPlaces() {
		return places;
	}

	public void setPlaces(Set<Place> places) {
		this.places = places;
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

	public GeoLocationTO getGeoLocationTO() {
		GeoLocationTO geoLocation = new GeoLocationTO();
		geoLocation.setLatitude(this.latitude);
		geoLocation.setLongitude(this.longitude);
		return geoLocation;
	}

}
