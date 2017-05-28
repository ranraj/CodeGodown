/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ran.learn.eventmanager;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.google.gson.Gson;

/**
 *
 * @author rdhanasekar
 */
@Path("healthcheck")
public class HealthCheck {
	private static final Logger LOGGER = Logger.getLogger(HealthCheck.class.getName());

	@Context
	private UriInfo context;

	/** Creates a new instance of HelloWorld */
	public HealthCheck() {
	}

	/**
	 * Retrieves representation of an instance of HealthCheck
	 * 
	 * @return an instance of java.lang.String
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getHealth() {
		LOGGER.log(Level.INFO, "Api call for " + context.getPath());
		Map<String, String> healthResponse = new HashMap<>();
		healthResponse.put("Message", "I am good");
		healthResponse.put("Date", new Date().toString());
		Gson gson = new Gson();
		return gson.toJson(healthResponse);
	}
}
