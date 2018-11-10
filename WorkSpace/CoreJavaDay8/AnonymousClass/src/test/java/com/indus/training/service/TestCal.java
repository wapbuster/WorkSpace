package com.indus.training.service;

import com.indus.training.service.impl.Cal;

import junit.framework.TestCase;

public class TestCal extends TestCase {
	//private Cal calObj = null;

	protected void setUp() throws Exception {
		//calObj = new Cal();
	}

	protected void tearDown() throws Exception {
		//calObj = null;
	}

	public void testAddition() {
		// Input
		double param1 = 30.0;
		double param2 = 20.0;

		// Expected Output
		double expResult = 50.0;

		// Actual Output
		double actualResult = calObj.addition(param1, param2);

		// Assertion
		assertEquals(expResult, actualResult, 0);
	}

}
