/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ran.learn.eventmanager.to;

import java.io.Serializable;

/**
 *
 * @author rdhanasekar
 */

public class EventTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private String name;
	private String description;

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

	@Override
	public String toString() {
		return "EventTO{" + "id=" + id + ", name=" + name + ", description=" + description + '}';
	}

}
