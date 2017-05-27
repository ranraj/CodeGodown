/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ran.learn.eventmanager.resource;

import java.text.ParseException;
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
import javax.ws.rs.core.Response;

import com.ran.learn.eventmanager.HealthCheck;
import com.ran.learn.eventmanager.entity.Event;
import com.ran.learn.eventmanager.service.EventService;
import com.ran.learn.eventmanager.to.EventTO;

/**
 *
 * @author rdhanasekar
 */
@Stateless
@Path("events")
public class EventResource {
	private static final Logger LOGGER = Logger.getLogger(HealthCheck.class.getName());

	@Inject
	private EventService service;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response create(EventTO event) throws ParseException {
		LOGGER.log(Level.INFO, "Create event for {0}", event);
		long createdId = service.create(event);
		return Response.status(Response.Status.CREATED).header("Location", "events/" + String.valueOf(createdId))
				.build();
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public EventTO find(@PathParam("id") long id) {
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
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response update(@PathParam("id") Long id, EventTO event) throws ParseException {
		LOGGER.log(Level.INFO, "Update event for {0}", event);
		if (id == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		event.setId(id);
		service.update(event);
		return Response.status(Response.Status.OK).build();
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") Long id) {
		if (id == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		service.remove(id);
		LOGGER.log(Level.INFO, "Delete event {0}", id);
		return Response.status(Response.Status.OK).build();
	}
}
