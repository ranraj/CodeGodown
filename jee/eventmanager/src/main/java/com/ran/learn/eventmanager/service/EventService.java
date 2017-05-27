/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ran.learn.eventmanager.service;

import com.ran.learn.eventmanager.entity.Event;
import com.ran.learn.eventmanager.repository.EventRepository;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author rdhanasekar
 */
public class EventService {

    @Inject
    EventRepository repository;

    public long create(Event event) {
        repository.create(event);
        return event.getId();
    }

    public void update(Event event) {
        repository.update(event);
    }

    public void remove(long id) {
        repository.remove(id);
    }

    public Event find(long id) {
        return repository.find(id);
    }

    public List<Event> findAll() {
        return repository.findAll();
    }
}
