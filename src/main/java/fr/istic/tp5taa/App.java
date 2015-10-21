package fr.istic.tp5taa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.istic.tp5taa.client.IClient;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "client-beans.xml" });
		IClient client1 = (IClient) context.getBean("clientImpl1");
		IClient client2 = (IClient) context.getBean("clientImpl2");
		IClient client3 = (IClient) context.getBean("clientImpl3");
		
		client1.run();
		client2.run();
		client3.run();
	}
}
