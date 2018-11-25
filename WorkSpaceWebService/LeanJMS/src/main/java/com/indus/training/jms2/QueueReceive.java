package com.indus.training.jms2;

import javax.jms.*;
import javax.naming.*;

public class QueueReceive {
	private static final String Q_CONNECTION_FACTORY = "JndiIndusQueueConnectionFactory";
	private static final String Q_NAME = "JndiIndusMsgQueue";
	private static Context jndiContext = null;
	private static QueueConnectionFactory queueConnectionFactory = null;

	public static void main(String... args) {
		QueueConnection queueConnection = null;
		QueueSession queueSession = null;
		Queue queue = null;
		QueueReceiver queueReceiver = null;
		TextMessage message = null;
		try {
			jndiContext = new InitialContext();
			queueConnectionFactory = (QueueConnectionFactory) jndiContext.lookup(Q_CONNECTION_FACTORY);
			queue = (Queue) jndiContext.lookup(Q_NAME);
		} catch (NamingException e) {
			System.out.println("Not able to create JNDI context: " + e.getMessage());
			System.exit(1);
		}
		try {
			queueConnection = queueConnectionFactory.createQueueConnection();
			queueSession = queueConnection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
			queueReceiver = queueSession.createReceiver(queue);
			queueConnection.start();
			while (true) {
				Message m = queueReceiver.receive(1);
				if (null != m && m instanceof TextMessage) {
					message = (TextMessage) m;
					System.out.println("Message read: " + message.getText());
				}
			}
		} catch (JMSException jmse) {
			System.out.println(jmse.getMessage());
		} finally {
			if (null != queueConnection) {
				try {
					queueConnection.close();
				} catch (JMSException jmse) {
				}
			}
		}
	}
}