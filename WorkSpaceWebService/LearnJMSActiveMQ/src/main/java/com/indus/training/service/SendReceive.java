package com.indus.training.service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.TextMessage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.jms.Destination;
import javax.jms.MessageConsumer;

import com.indus.training.ex.IndusException;
import com.indus.training.infra.Infra;

public class SendReceive {
	private MessageProducer producer = null;
	private MessageConsumer consumer = null;
	Infra infraObj = new Infra();

	public void send() throws IndusException{

		TextMessage message;
		try {
			producer = infraObj.getSession().createProducer(infraObj.getDestination());
			message = infraObj.getSession().createTextMessage();
			BufferedReader msgStream = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			boolean quitNow = false;

			do {
				System.out.print("Enter message (\"quit\" to quit): \n");
				line = msgStream.readLine();
				if (line.equalsIgnoreCase("quit")) {
					System.exit(1);
				}
				if (line != null && line.trim().length() != 0) {
					message.setText(line);
					producer.send(message);
					System.out.println("JMS Message Sent: " + line + "\n");
					quitNow = line.equalsIgnoreCase("quit");
					// System.out.println(quitNow);
				}
			} while (!quitNow);

			// System.out.println("Sent: " + message.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void receive() {

		try {
			Destination destination = infraObj.getSession().createQueue("myQueue");
			infraObj.setDestination(destination);
			consumer = infraObj.getSession().createConsumer(destination);
			// Message message = consumer.receive();
			while (true) {
				Message message = consumer.receive();
				if (message instanceof TextMessage && null != message) {
					TextMessage text = (TextMessage) message;

					System.out.println("Message is : " + text.getText());

				}
			}
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}	

}
