package com.yaliprowess.spring.akka.controller;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import scala.concurrent.Await;
import scala.concurrent.Future;
import scala.concurrent.duration.Duration;
import static akka.japi.Util.classTag;
import static akka.pattern.Patterns.ask;

@RestController
@RequestMapping("/post")
public class PostController {
	
	@Autowired
	ActorSystem system;
	
	@RequestMapping(method = RequestMethod.GET)
	public Post retrieve(ModelMap model) {			
		return getAll();
	}	
	private Post getAll(){		
		ActorRef agrg8r = system.actorOf(Props.create(PostActor.class));
  		PostActor.RetrieveIdea retrieveMessage = new PostActor.RetrieveIdea();
  		Future<Post> futureResponse = ask(agrg8r, retrieveMessage, 60000).mapTo(classTag(Post.class));
  		Post response=null;
		try {
			response = Await.result(futureResponse, Duration.create(60, TimeUnit.SECONDS));			
		} catch (Exception e) {		
			e.printStackTrace();
		}
		return response;				
	}
}
