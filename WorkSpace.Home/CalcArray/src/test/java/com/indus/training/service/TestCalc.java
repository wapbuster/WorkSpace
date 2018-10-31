package com.indus.training.service;

import com.indus.training.service.impl.Calc;

import junit.framework.TestCase;

public class TestCalc extends TestCase {

	private Calc calObj = null;

	protected void setUp() throws Exception {
		calObj = new Calc();
	}

	protected void tearDown() throws Exception {
		calObj = null;
	}

	public void testAddition() {
		double param[] = new double[4];

		// Input

		param[0] = 10.0;
		param[1] = 20.0;
		param[2] = 30.0;
		param[3] = 40.0;

		// Expected Output
		double expResult = 100.0;

		// Actual Output
		double actualResult = calObj.addition(param);

		// Assertion
		assertEquals(expResult, actualResult, 0);
	}

}
