package com.indus.training.service;

import com.indus.training.service.impl.Cal;
import com.indus.training.service.impl.SciCal;

import junit.framework.TestCase;

public class TestCal extends TestCase {
	//private Cal calObj = null;
	private SciCal sciCalObj = null;

	protected void setUp() throws Exception {
		//calObj = new SciCal();
		sciCalObj = new SciCal();
	}

	protected void tearDown() throws Exception {
		//calObj = null;
		sciCalObj = null;
	}

	public void testCos() {
		// Input
		double param1 = 0.0;
		// Expected Result
		double expResult = 1.0;
		// Actual Result
		double actualResult = sciCalObj.cos(param1);
		// Assertion
		assertEquals(expResult, actualResult, 0);
	}

	public void testAddition() {
		// Input
		double param1 = 10.0;
		double param2 = 20.0;
		// Expected Result
		double expResult = 30.0;
		// Actual Result
		double actualResult = sciCalObj.addition(param1, param2);
		// Assertion
		assertEquals(expResult, actualResult, 0);
	}

}
