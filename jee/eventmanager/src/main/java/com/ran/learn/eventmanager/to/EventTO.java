/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ran.learn.eventmanager.to;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.time.DateUtils;

import com.google.gson.JsonObject;
import com.ran.learn.eventmanager.entity.Event;
import com.ran.learn.eventmanager.utils.Constants;

/**
 *
 * @author rdhanasekar
 */
@XmlRootElement
public class EventTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String name;
	private String description;
	private PlaceTO place;

	private String date;

	public EventTO() {
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public PlaceTO getPlace() {
		return place;
	}

	public void setPlace(PlaceTO place) {
		this.place = place;
	}

	public Event getEntity() throws ParseException {
		Event event = new Event();
		if (this.getDate() != null) {
			final String[] parsers = new String[] { Constants.TIMESTAMP_FORMAT };
			Date date = DateUtils.parseDate(this.getDate(), parsers);
			event.setDate(date);
		}
		event.setDescription(this.getDescription());
		event.setId(this.getId());
		event.setName(this.getName());
		if (this.place != null) {
			event.setPlace(this.getPlace().getPlaceTO());
		}
		return event;
	}

	public EventTO fromJson(JsonObject jsonObject) {

		if (jsonObject.get("id") != null) {
			this.setId(jsonObject.get("id").getAsLong());
		}
		if (jsonObject.get("name") != null) {
			this.setName(jsonObject.get("name").getAsString());
		}
		if (jsonObject.get("description") != null) {
			this.setDescription(jsonObject.get("description").getAsString());
		}
		if (jsonObject.get("place") != null) {
			JsonObject placeObject = jsonObject.get("place").getAsJsonObject();
			this.setPlace(new PlaceTO().fromJson(placeObject));
		}
		return this;
	}

	public StringBuffer toJson() {
		StringBuffer buffer = new StringBuffer();

		buffer = buffer.append("{");
		buffer = buffer.append("\"id\":\"").append(this.getId()).append("\",");
		buffer = buffer.append("\"name\":\"").append(this.getName()).append("\",");
		buffer = buffer.append("\"description\":\"").append(this.getDescription());

		if (this.place != null) {
			buffer.append("\",");
			buffer = buffer.append("\"place\":").append(this.place.toJson());
		} else {
			buffer.append("\"");
		}
		buffer = buffer.append("}");
		return buffer;
	}

	@Override
	public String toString() {
		return "EventTO{" + "id=" + id + ", name=" + name + ", description=" + description + "Place " + place + '}';
	}

}
