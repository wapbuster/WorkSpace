package com.indus.training.scical;

import com.indus.training.scical.impl.SciCal;

import junit.framework.TestCase;

public class TestSciCal extends TestCase {
	private SciCal sciObj = null;

	protected void setUp() throws Exception {
		sciObj = new SciCal();
	}

	protected void tearDown() throws Exception {
		sciObj = null;
	}

	public void testTanScenario1() {
		//Input
		double value=45.0;
		//Expected Result
		double expResult=0.9999999999999999;
		//Actual Result
		double actualResult=sciObj.tan(value);
		//Assertion
		assertEquals(expResult, actualResult, 0);
		
	}

	public void testTanScenario2() {
		// Input
		double value = 60.0;
		// Expected Result
		double expResult = 1.7320508075688767;
		// Actual Result
		double actualResult = sciObj.tan(value);
		// Assertion
		assertEquals(expResult, actualResult, 0);

	}

	public void testCosScenario1() {
		//Input
				double value=0.0;
				//Expected Result
				double expResult=1.0;
				//Actual Result
				double actualResult=sciObj.cos(value);
				//Assertion
				assertEquals(expResult, actualResult, 0);
	}

	public void testCosScenario2() {
		//Input
				double value=180.0;
				//Expected Result
				double expResult=-1.0;
				//Actual Result
				double actualResult=sciObj.cos(value);
				//Assertion
				assertEquals(expResult, actualResult, 0);
	}

	public void testSinScenario1() {
		//Input
				double value=30.0;
				//Expected Result
				double expResult=0.49999999999999994;
				//Actual Result
				double actualResult=sciObj.sin(value);
				//Assertion
				assertEquals(expResult, actualResult, 0);
	}

	public void testSinScenario2() {
		//Input
				double value=90.0;
				//Expected Result
				double expResult=1.0;
				//Actual Result
				double actualResult=sciObj.sin(value);
				//Assertion
				assertEquals(expResult, actualResult, 0);
	}

	public void testSqRootScenario1() {
		//Input
				double value=2.0;
				//Expected Result
				double expResult=1.4142135623730951;
				//Actual Result
				double actualResult=sciObj.sqRoot(value);
				//Assertion
				assertEquals(expResult, actualResult, 0);
	}

	public void testSqRootScenario2() {
		//Input
				double value=9.0;
				//Expected Result
				double expResult=3.0;
				//Actual Result
				double actualResult=sciObj.sqRoot(value);;
				//Assertion
				assertEquals(expResult, actualResult, 0);
	}

}
