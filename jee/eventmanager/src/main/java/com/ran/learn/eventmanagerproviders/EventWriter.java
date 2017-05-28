package com.ran.learn.eventmanagerproviders;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import com.ran.learn.eventmanager.to.EventTO;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
public class EventWriter implements MessageBodyWriter<EventTO> {
	@Override
	public boolean isWriteable(Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
		return true;
	}

	@Override
	public long getSize(EventTO event, Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
		return -1;
	}

	@Override
	public void writeTo(EventTO event, Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> stringObjectMultivaluedMap, OutputStream outputStream)
			throws IOException, WebApplicationException {
		// TODO: Not required
	}
}