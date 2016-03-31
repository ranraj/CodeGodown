package akka.tutorial.first.java;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.testkit.TestActor;
import akka.testkit.TestActorRef;
import akka.testkit.TestProbe;
import akka.tutorial.first.java.actors.Worker;

@RunWith(MockitoJUnitRunner.class)
public class TestBusinessActor {
	ActorSystem actorSystem = ActorSystem.apply();

	private Props props = Props.create(Worker.class);

	private TestActorRef<Worker> workerRef;

	@Before
	public void initActor() {
		actorSystem = ActorSystem.apply();
		workerRef = TestActorRef.create(actorSystem, props, "testB");
	}

	@Test
	public void calculatePiFor1() {
		TestProbe testProbe = TestProbe.apply(actorSystem);
		Work work = new Work(0, 10);
		workerRef.tell(work, testProbe.ref());

		testProbe.expectMsgClass(Result.class);
		TestActor.Message message = testProbe.lastMessage();
		Result resultMsg = (Result) message.msg();
		System.out.println(resultMsg.getValue());
		assertEquals(0.0, resultMsg.getValue(), 3.0418396189294032);
	}

	@Test
	public void calculatePiFor0() {
		TestProbe testProbe = TestProbe.apply(actorSystem);
		Work work = new Work(0, 0);
		workerRef.tell(work, testProbe.ref());

		testProbe.expectMsgClass(Result.class);
		TestActor.Message message = testProbe.lastMessage();
		Result resultMsg = (Result) message.msg();
		System.out.println(resultMsg.getValue());
		assertEquals(0.0, resultMsg.getValue(), 0.000001);
	}
}