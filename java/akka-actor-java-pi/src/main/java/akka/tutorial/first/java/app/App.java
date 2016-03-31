package akka.tutorial.first.java.app;

import akka.tutorial.first.java.Pi;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
	    Pi pi = new Pi();
	    pi.calculate(10, 100, 10);
	}
}
