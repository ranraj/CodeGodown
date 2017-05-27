/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ran.learn.eventmanager.service;

import java.util.List;

import javax.inject.Inject;

import com.ran.learn.eventmanager.entity.Event;
import com.ran.learn.eventmanager.repository.EventRepository;
import com.ran.learn.eventmanager.to.EventTO;

/**
 *
 * @author rdhanasekar
 */
public class EventService {

	@Inject
	EventRepository repository;

	public long create(EventTO eventTO) {
		Event event = toEntity(eventTO);
		repository.create(event);
		return event.getId();
	}

	public void update(EventTO eventTO) {
		Event event = toEntity(eventTO);
		repository.update(event);
	}

	public void remove(long id) {
		repository.remove(id);
	}

	public EventTO find(long id) {
		return fromEntity(repository.find(id));
	}

	public List<Event> findAll() {
		return repository.findAll();
	}

	private Event toEntity(EventTO e) {
		if (e == null) {
			return null;
		}
		Event event = new Event();
		event.setDate(e.getDate());
		event.setDescription(e.getDescription());
		event.setId(e.getId());
		event.setName(e.getName());
		return event;
	}

	private EventTO fromEntity(Event e) {
		if (e == null) {
			return null;
		}
		EventTO event = new EventTO();
		event.setDate(e.getDate());
		event.setDescription(e.getDescription());
		event.setId(e.getId());
		event.setName(e.getName());
		return event;
	}
}
