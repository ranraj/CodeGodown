package com.ran.learn.eventmanagerproviders;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ran.learn.eventmanager.to.EventTO;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
public class EventReader implements MessageBodyReader<EventTO> {

	@Override
	public EventTO readFrom(Class<EventTO> type, Type type1, Annotation[] antns, MediaType mt,
			MultivaluedMap<String, String> mm, InputStream in) throws IOException, WebApplicationException {

		InputStreamReader reader = new InputStreamReader(in);
		JsonElement json = new JsonParser().parse(reader);
		JsonObject jsonObject = json.getAsJsonObject();
		EventTO event = new EventTO();
		return event.fromJson(jsonObject);
	}

	@Override
	public boolean isReadable(Class<?> type, Type type1, Annotation[] antns, MediaType mt) {
		return EventTO.class.isAssignableFrom(type);
	}

}