/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ran.learn.eventmanager.service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;

import com.ran.learn.eventmanager.entity.Event;
import com.ran.learn.eventmanager.repository.EventRepository;
import com.ran.learn.eventmanager.to.EventTO;
import com.ran.learn.eventmanager.utils.Constants;

/**
 *
 * @author rdhanasekar
 */
public class EventService {

	@Inject
	EventRepository repository;

	public long create(EventTO eventTO) throws ParseException {
		Event event = toEntity(eventTO);
		repository.create(event);
		return event.getId();
	}

	public void update(EventTO eventTO) throws ParseException {
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

	private Event toEntity(EventTO e) throws ParseException {
		if (e == null) {
			return null;
		}
		Event event = new Event();
		if (e.getDate() != null) {
			final String[] parsers = new String[] { Constants.TIMESTAMP_FORMAT };
			Date date = DateUtils.parseDate(e.getDate(), parsers);
			event.setDate(date);
		}
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
		if (e.getDate() != null) {
			event.setDate(DateFormatUtils.format(e.getDate(), Constants.TIMESTAMP_FORMAT));
		}
		event.setDescription(e.getDescription());
		event.setId(e.getId());
		event.setName(e.getName());
		return event;
	}
}
