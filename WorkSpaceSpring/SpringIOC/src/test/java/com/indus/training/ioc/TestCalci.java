package com.indus.training.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class TestCalci extends TestCase {

	private ICalci calObj = null;

	protected void setUp() throws Exception {
		ApplicationContext appContextObj = new ClassPathXmlApplicationContext("beans.xml");
		calObj = (ICalci) appContextObj.getBean("calciObj");

		//calObj = appContextObj.getBean("calciObj", ICalci.class);

		appContextObj = null; 
	}

	protected void tearDown() throws Exception {
		calObj = null;
		
	}

	public void testAddtionCase1() {

		try {
			assertEquals(new Double(10.0), calObj.addtion(new Double(5.0), new Double(5.0)), 0);
		} catch (Exception e) {
			e.printStackTrace();
			fail("CalciImpl addtion method failed");
		}
	}

}
