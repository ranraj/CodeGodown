/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ran.learn.eventmanager.binding;

import com.ran.learn.eventmanager.entity.Event;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
/**
 *
 * @author rdhanasekar
 */

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class EventMessageBodyWriter implements MessageBodyWriter<Event>{
    @Override
    public boolean isWriteable(Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return true;
    }

    @Override
    public long getSize(Event event, Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return -1;
    }

    @Override
    public void writeTo(Event event, Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType,
                        MultivaluedMap<String, Object> stringObjectMultivaluedMap, OutputStream outputStream) throws IOException, WebApplicationException {

        if (mediaType.getType().equals("application") && mediaType.getSubtype().equals("json")) {
            StringBuffer buffer = new StringBuffer();

            buffer = buffer.append("{");
            buffer = buffer.append("\"id\":\"").append(event.getId()).append("\",");
            buffer = buffer.append("\"name\":\"").append(event.getName()).append("\",");
            buffer = buffer.append("\"description\":\"").append(event.getDescription()).append("\"");
            buffer = buffer.append("}");
              
            try (PrintStream printStream = new PrintStream(outputStream)) {
                printStream.print(buffer.toString());
            }
            return;
        }
        throw new UnsupportedOperationException("Not supported MediaType: " + mediaType);
}
}
