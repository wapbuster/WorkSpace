package com.indus.training.infra;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Session;

import org.apache.activemq.*;

public class Infra {

	private ConnectionFactory factory = null;
	private Connection connection = null;
	private Session session = null;
	private Destination destination = null;
	public static String test = ActiveMQConnection.DEFAULT_BROKER_URL;

	public Session getSession() {
		return session;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public Infra() {

		try {
			//factory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_BROKER_URL);
			factory = new ActiveMQConnectionFactory("tcp://192.168.1.9:61616");
			connection = factory.createConnection();
			connection.start();
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			destination = session.createQueue("myQueue");
		} catch (JMSException e) {
			e.printStackTrace();
		}

	}

}
