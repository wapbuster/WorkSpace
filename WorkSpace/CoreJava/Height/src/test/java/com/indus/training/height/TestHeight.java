package com.indus.training.height;

import com.indus.training.height.impl.Height;

import junit.framework.TestCase;

public class TestHeight extends TestCase {
	private Height heiObj = null;

	protected void setUp() throws Exception {
		heiObj = new Height();
	}

	protected void tearDown() throws Exception {
		heiObj = null;
	}

	public void testInchToFeetScenario1() {
		// Input
		double value = 1.0;

		// Expected value
		double expValue = 0.08333333333333333;

		// Actual value
		double actualValue = heiObj.inchToFeet(value);

		// Assertion
		assertEquals(expValue, actualValue, 0);
	}

	public void testInchToFeetScenario2() {
		// Input
		double value = 5.0;

		// Expected value
		double expValue = 0.4166666666666667;

		// Actual value
		double actualValue = heiObj.inchToFeet(value);

		// Assertion
		assertEquals(expValue, actualValue, 0);

	}

	public void testInchToFeetScenario3() {
		// Input
		double value = 125.2;

		// Expected value
		double expValue = 10.433333333333334;

		// Actual value
		double actualValue = heiObj.inchToFeet(value);

		// Assertion
		assertEquals(expValue, actualValue, 0);

	}

	public void testFeetToInchScenario1() {
		// Input
		double value = 6.1;

		// Expected value
		double expValue = 73.19999999999999;

		// Actual value
		double actualValue = heiObj.feetToInch(value);

		// Assertion
		assertEquals(expValue, actualValue, 0);

	}

	public void testFeetToInchScenario2() {
		// Input
		double value = 5.5;

		// Expected value
		double expValue = 66.0;

		// Actual value
		double actualValue = heiObj.feetToInch(value);

		// Assertion
		assertEquals(expValue, actualValue, 0);

	}

	public void testFeetToInchScenario3() {
		// Input
		double value = 45.0;

		// Expected value
		double expValue = 540.0;

		// Actual value
		double actualValue = heiObj.feetToInch(value);

		// Assertion
		assertEquals(expValue, actualValue, 0);

	}

}
