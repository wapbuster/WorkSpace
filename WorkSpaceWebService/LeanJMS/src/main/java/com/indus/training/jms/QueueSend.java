package com.indus.training.jms;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.Hashtable;

import javax.jms.*;

import javax.naming.Context;

import javax.naming.InitialContext;

import javax.naming.NamingException;

public class QueueSend

{

	public final static String JNDI_FACTORY = "weblogic.jndi.WLInitialContextFactory";

	public final static String JMS_FACTORY = "JndiIndusQueueConnectionFactory";

	public final static String QUEUE = "JndiIndusMsgQueue";

	private QueueConnectionFactory qconFactory;

	private QueueConnection qcon;

	private QueueSession qsession;

	private QueueSender qsender;

	private Queue queue;

	private TextMessage msg;

	public void init(Context ctx, String queueName)

			throws NamingException, JMSException

	{

		qconFactory = (QueueConnectionFactory) ctx.lookup(JMS_FACTORY);

		qcon = qconFactory.createQueueConnection();

		qsession = qcon.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);

		queue = (Queue) ctx.lookup(queueName);

		qsender = qsession.createSender(queue);

		msg = qsession.createTextMessage();

		qcon.start();

	}

	public void send(String message) throws JMSException {

		msg.setText(message);

		qsender.send(msg);

	}

	public void close() throws JMSException {

		qsender.close();

		qsession.close();

		qcon.close();

	}

	public static void main(String[] args) throws Exception {

		InitialContext ic = getInitialContext("t3://localhost:9010/");

		QueueSend qs = new QueueSend();

		qs.init(ic, QUEUE);

		readAndSend(qs);

		qs.close();

	}

	private static void readAndSend(QueueSend qs) throws IOException, JMSException

	{

		BufferedReader msgStream = new BufferedReader(new InputStreamReader(System.in));

		String line = null;

		boolean quitNow = false;

		do {

			System.out.print("Enter message (\"quit\" to quit): \n");

			line = msgStream.readLine();

			if (line != null && line.trim().length() != 0) {

				qs.send(line);

				System.out.println("JMS Message Sent: " + line + "\n");

				quitNow = line.equalsIgnoreCase("quit");

			}

		} while (!quitNow);

	}

	private static InitialContext getInitialContext(String url)

			throws NamingException

	{

		Hashtable<String, String> env = new Hashtable<String, String>();

		env.put(Context.INITIAL_CONTEXT_FACTORY, JNDI_FACTORY);

		env.put(Context.PROVIDER_URL, url);

		return new InitialContext(env);

	}

}