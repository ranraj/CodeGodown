/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ran.learn.eventmanager.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang.time.DateFormatUtils;

import com.ran.learn.eventmanager.to.EventTO;
import com.ran.learn.eventmanager.utils.Constants;

/**
 *
 * @author rdhanasekar
 */
@Entity
@Table(name = "event")
@NamedQueries({ @NamedQuery(name = "Event.findAll", query = "select e from Event e") })
public class Event extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String description;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "event_date")
	private Date date;

	@OneToOne(cascade = CascadeType.ALL)
	private Place place;

	public Event() {
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public EventTO getEventTO() {
		EventTO event = new EventTO();
		if (this.getDate() != null) {
			event.setDate(DateFormatUtils.format(this.getDate(), Constants.TIMESTAMP_FORMAT));
		}
		event.setDescription(this.getDescription());
		event.setId(this.getId());
		event.setName(this.getName());
		return event;
	}

	@Override
	public String toString() {
		return "Event{" + "id=" + getId() + ", name=" + name + ", description=" + description + '}';
	}

}
