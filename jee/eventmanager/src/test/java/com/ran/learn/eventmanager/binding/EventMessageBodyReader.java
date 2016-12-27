/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ran.learn.eventmanager.binding;

import com.ran.learn.eventmanager.entity.Event;
import org.codehaus.jackson.map.ObjectMapper;

import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
/**
 *
 * @author rdhanasekar
 */
 
@Provider
@Consumes(MediaType.APPLICATION_JSON)
public class EventMessageBodyReader implements MessageBodyReader<Event> {

    @Override
    public boolean isReadable(Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return true;
    }

    @Override
    public Event readFrom(Class<Event> customerClass, Type type, Annotation[] annotations, MediaType mediaType,
                             MultivaluedMap<String, String> stringStringMultivaluedMap, InputStream inputStream) throws IOException, WebApplicationException {
        if (mediaType.getType().equals("application") && mediaType.getSubtype().equals("json")) {
            ObjectMapper mapper = new ObjectMapper();
            System.out.println("Io "+inputStream);
            return mapper.readValue(inputStream, Event.class);
        }
        System.out.println("Io1 "+inputStream);
        throw new UnsupportedOperationException("Not supported MediaType: " + mediaType);
    }
}
 
