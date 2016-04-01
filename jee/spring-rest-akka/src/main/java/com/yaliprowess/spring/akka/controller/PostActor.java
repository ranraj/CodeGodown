package com.yaliprowess.spring.akka.controller;

import org.springframework.web.client.RestTemplate;

import akka.actor.ActorRef;
import akka.actor.UntypedActor;

public class PostActor extends UntypedActor {
	 
	public static class RetrieveIdea {}

	@Override
	public void onReceive(Object message) throws Exception {

		if (message instanceof RetrieveIdea) {			
			ActorRef sender = getSender();		
			RestTemplate restTemplate = new RestTemplate();
			Post post = restTemplate.getForObject("http://jsonplaceholder.typicode.com/posts/1", Post.class);		
			sender.tell(post, sender);
		}
	}
}
