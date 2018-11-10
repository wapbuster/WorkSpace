package com.indus.training.service;

import com.indus.training.service.impl.Area;

import junit.framework.TestCase;

public class TestCalcArea extends TestCase {

	private Area areaObj = null;

	protected void setUp() throws Exception {
		areaObj = new Area();
	}

	protected void tearDown() throws Exception {
		areaObj = null;
	}

	public void testSquare() {
		// input
		double side = 4.0;

		// Expected Result
		double expResult = 16.0;

		// Actual Result
		double actResult = areaObj.square(side);

		// Assertion
		assertEquals(expResult, actResult, 0);
	}

	public void testRectangle() {
		// input
		double length = 3.0;
		double breadth = 5.0;

		// Expected Result
		double expResult = 15.0;

		// Actual Result
		double actResult = areaObj.rectangle(length, breadth);

		// Assertion
		assertEquals(expResult, actResult, 0);
	}

	public void testCircle() {
		// input
		double radius = 3.0;

		// Expected Result
		double expResult = 28.26;

		// Actual Result
		double actResult = areaObj.circle(radius);

		// Assertion
		assertEquals(expResult, actResult, 0);
	}

	public void testAddition() {
		// input
		double param1 = 3.0;
		double param2 = 4.0;

		// Expected Result
		double expResult = 7.0;

		// Actual Result
		double actResult = areaObj.addition(param1, param2);

		// Assertion
		assertEquals(expResult, actResult, 0);
	}

	public void testSubtract() {
		// input
		double param1 = 6.0;
		double param2 = 4.0;

		// Expected Result
		double expResult = 2.0;

		// Actual Result
		double actResult = areaObj.subtract(param1, param2);

		// Assertion
		assertEquals(expResult, actResult, 0);
	}

	public void testDivision() {
		// input
		double param1 = 8.0;
		double param2 = 4.0;

		// Expected Result
		double expResult = 2.0;

		// Actual Result
		double actResult = areaObj.division(param1, param2);

		// Assertion
		assertEquals(expResult, actResult, 0);
	}

	public void testMultiply() {
		// input
		double param1 = 3.0;
		double param2 = 4.0;

		// Expected Result
		double expResult = 12.0;

		// Actual Result
		double actResult = areaObj.multiply(param1, param2);

		// Assertion
		assertEquals(expResult, actResult, 0);
	}

}
