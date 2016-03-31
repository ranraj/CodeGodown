package akka.tutorial.first.java;
 
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.actor.UntypedActorFactory;
import akka.tutorial.first.java.actors.Listener;
import akka.tutorial.first.java.actors.Master;
 
 
public class Pi {
	
  public void calculate(final int nrOfWorkers, final int nrOfElements, final int nrOfMessages) {
    // Create an Akka system
    ActorSystem system = ActorSystem.create("PiSystem");
 
    // create the result listener, which will print the result and shutdown the system
    final ActorRef listener = system.actorOf(Props.create(Listener.class), "listener");
 
    // create the master
    ActorRef master = system.actorOf(Props.create(new UntypedActorFactory() {
      /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	public UntypedActor create() {
        return new Master(nrOfWorkers, nrOfMessages, nrOfElements, listener);
      }
    }), "master");
 
    // start the calculation
    master.tell(new Calculate(), master);
 
  }
}