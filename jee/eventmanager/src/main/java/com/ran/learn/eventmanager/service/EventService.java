/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ran.learn.eventmanager.service;

import java.text.ParseException;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

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

	public long create(EventTO eventTO) throws ParseException {
		Event event = eventTO.getEntity();
		repository.create(event);
		return event.getId();
	}

	public void update(EventTO eventTO) throws ParseException {
		Event event = eventTO.getEntity();
		repository.update(event);
	}

	public void remove(long id) {
		repository.remove(id);
	}

	public Optional<EventTO> find(long id) {
		Event event = repository.find(id);
		return event != null ? Optional.of(event.getEventTO()) : Optional.empty();
	}

	public Set<EventTO> findAll() {
		return repository.findAll().stream().map(event -> event.getEventTO()).collect(Collectors.toSet());
	}

}
