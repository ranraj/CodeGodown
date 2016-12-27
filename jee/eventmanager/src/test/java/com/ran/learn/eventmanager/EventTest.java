/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ran.learn.eventmanager;

import com.ran.learn.eventmanager.binding.EventMessageBodyReader;
import com.ran.learn.eventmanager.binding.EventMessageBodyWriter;
import com.ran.learn.eventmanager.entity.Event;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author rdhanasekar
 */
public class EventTest {
    private static final String SERVER = "http://localhost:8080/eventmanager/api/events";
 
    private WebTarget target;
 
    @Before
    public void setUp() {
        Client client = ClientBuilder.newClient();
        client.register(EventMessageBodyReader.class);
        client.register(EventMessageBodyWriter.class);
        this.target = client.target(SERVER);
    }
 
    @Test
    public void crud() {
      
        Event origin = new Event();
        origin.setName("Ranjith");
        origin.setDescription("Enjoy");
        System.out.println("origin"+origin);
        Entity<Event> entity = Entity.entity(origin, MediaType.APPLICATION_JSON);
        
        // Create
        Response response = target.request(MediaType.APPLICATION_JSON).post(entity, Response.class);
        Assert.assertThat(response.getStatus(), CoreMatchers.equalTo(204));
        
        // Get
        //FixMe: path param
        /*Event result = target.path(String.valueOf(origin.getId())).request(MediaType.APPLICATION_JSON).get(Event.class);
        Assert.assertThat(result, CoreMatchers.equalTo(origin));*/
 
        // Update
        entity.getEntity().setName("Modified");
        response = target.request().put(entity);
        Assert.assertThat(response.getStatus(), CoreMatchers.equalTo(204));
        
        // Delete
        target.path(String.valueOf(origin.getId())).request(MediaType.APPLICATION_JSON).delete();
        Assert.assertThat(response.getStatus(), CoreMatchers.equalTo(204));
    }
}
