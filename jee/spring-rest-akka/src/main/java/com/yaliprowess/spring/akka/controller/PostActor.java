package com.yaliprowess.spring.akka.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.web.client.AsyncRestTemplate;

import akka.actor.ActorRef;
import akka.actor.UntypedActor;

@ComponentScan
public class PostActor extends UntypedActor {
	 
	public static class RetrieveIdea {}
	
	@Autowired
	private AsyncRestTemplate asyncRestTemplate;	
	
	@Override
	public void onReceive(Object message) throws Exception {
		asyncRestTemplate = new AsyncRestTemplate();
		if (message instanceof RetrieveIdea) {			
			ActorRef sender = getSender();			
						
			ListenableFuture<ResponseEntity<Post>> future = asyncRestTemplate.getForEntity("http://jsonplaceholder.typicode.com/posts/1", Post.class);
			 while (!future.isDone()) {
				   TimeUnit.MILLISECONDS.sleep(100);
				  }

			ResponseEntity<Post> entity = future.get();
			sender.tell(entity.getBody(), sender);
		}
	}	
	
}
