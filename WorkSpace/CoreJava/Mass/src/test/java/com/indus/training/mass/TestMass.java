package com.indus.training.mass;

import com.indus.training.mass.impl.Mass;

import junit.framework.TestCase;

public class TestMass extends TestCase {
	private Mass masObj = null;

	protected void setUp() throws Exception {
		masObj = new Mass();
	}

	protected void tearDown() throws Exception {
		masObj = null;
	}

	public void testKgToPoundScenario1() {
		// Input
		double ktop = 1.0;
		// Expected Result
		double expResult = 2.20462;
		// Actual Result
		double actualResult = masObj.kgToPound(ktop);
		// Assertion
		assertEquals(expResult, actualResult, 0);

	}

	public void testKgToPoundScenario2() {
		// Input
		double ktop = 25.0;
		// Expected Result
		double expResult = 55.1155;
		// Actual Result
		double actualResult = masObj.kgToPound(ktop);
		// Assertion
		assertEquals(expResult, actualResult, 0);

	}

	public void testKgToPoundScenario3() {
		// Input
		double ktop = 55.3;
		// Expected Result
		double expResult = 121.91548599999999;
		// Actual Result
		double actualResult = masObj.kgToPound(ktop);
		// Assertion
		assertEquals(expResult, actualResult, 0);

	}

	public void testPoundToKgScenario1() {
		// Input
		double ptok = 1;
		// Expected Result
		double expResult = 0.453592;
		// Actual Result
		double actualresult = masObj.poundToKg(ptok);
		// Assertion
		assertEquals(expResult, actualresult, 0);
	}

	public void testPoundToKgScenario2() {
		// Input
		double ptok = 123;
		// Expected Result
		double expResult = 55.791816;
		// Actual Result
		double actualresult = masObj.poundToKg(ptok);
		// Assertion
		assertEquals(expResult, actualresult, 0);
	}

	public void testPoundToKgScenario3() {
		// Input
		double ptok = 197.3;
		// Expected Result
		double expResult = 89.49370160000001;
		// Actual Result
		double actualresult = masObj.poundToKg(ptok);
		// Assertion
		assertEquals(expResult, actualresult, 0);
	}

}
