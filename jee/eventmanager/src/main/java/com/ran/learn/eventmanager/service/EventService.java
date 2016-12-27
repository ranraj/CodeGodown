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
    EventRepository service;

    public void create(Event event) {
        service.create(event);
    }

    public void update(Event event) {
        service.update(event);
    }

    public void remove(long id) {
        service.remove(id);
    }

    public Event find(long id) {
        return service.find(id);
    }

    public List<Event> findAll() {
        return service.findAll();
    }
}
