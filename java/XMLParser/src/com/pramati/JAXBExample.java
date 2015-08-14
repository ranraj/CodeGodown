package com.pramati;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBExample {
	public static void main(String[] args) {

	 try {

		File file = new File("resources/order.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(Orders.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Orders customer = (Orders) jaxbUnmarshaller.unmarshal(file);
		System.out.println(customer.getCmd());
		System.out.println(customer.getOrder().getOrderId());

	  } catch (JAXBException e) {
		e.printStackTrace();
	  }

	}
}
