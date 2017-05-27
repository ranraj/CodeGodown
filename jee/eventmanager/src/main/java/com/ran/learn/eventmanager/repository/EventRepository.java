/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ran.learn.eventmanager.repository;

import com.ran.learn.eventmanager.entity.Event;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NamedQueries;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rdhanasekar
 */
@Stateless
public class EventRepository {
    @PersistenceContext(unitName="event-manager")
    EntityManager em;
 
    public void create(Event event) {
        em.persist(event);
    }
 
    public void update(Event event) {
        em.merge(event);
    }
 
    public void remove(long id) {
        Event customer = find(id);
        em.remove(customer);
    }
 
    public Event find(long id) {
        return em.find(Event.class, id);
    }

    public List<Event> findAll() {
        return em.createNamedQuery("Event.findAll", Event.class).getResultList();
    }
}
