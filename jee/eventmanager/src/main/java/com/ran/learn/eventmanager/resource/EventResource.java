/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ran.learn.eventmanager.resource;

import com.ran.learn.eventmanager.HealthCheck;
import com.ran.learn.eventmanager.entity.Event;
import com.ran.learn.eventmanager.service.EventService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author rdhanasekar
 */
@Stateless
@Path("events")
public class EventResource {
    private static final Logger LOGGER = Logger.getLogger(HealthCheck.class.getName());
    @Inject
    EventService service;
 
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(Event event) {
        LOGGER.log(Level.INFO, "Create event for {0}", event);
        service.create(event);
    }
 
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Event find(@PathParam("id") long id) {
        LOGGER.log(Level.INFO, "Find event for {0}", id);
        return service.find(id);
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Event> findAll() {
        LOGGER.log(Level.INFO, "Find All events");
        return service.findAll();
    }
 
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(Event event) {
        LOGGER.log(Level.INFO, "Update event for {0}",event);
        service.update(event);
    }
 
    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") long id) {
        LOGGER.log(Level.INFO, "Delete event {0}",id);
        service.remove(id);
    }
}
