package com.indus.training.core;

import com.indus.training.core.impl.Calculator;

import junit.framework.TestCase;

public class TestCalculator extends TestCase {
	
	private Calculator calObj = null;
	
	protected void setUp() throws Exception {
		calObj = new Calculator();
	}

	protected void tearDown() throws Exception {
		calObj = null;
	}

	public void testAdditionSenario1() {
		
		// Input
		double param1 = 10.0;
		double param2 = 20.0;
					
		// Expected Output
		double expResult = 30.0;
		
		//Actual Output
		double actualResult = calObj.addition(param1, param2);
		
		//Assertion
		assertEquals(expResult, actualResult, 0);
		
		
	}
	
	public void testAdditionSenario2() {
		fail("Not yet implemented");
	}
	
	public void testAdditionSenario3() {
		fail("Not yet implemented");
	}

	public void testSubtrat() {
		fail("Not yet implemented");
	}

	public void testMultiply() {
		fail("Not yet implemented");
	}

	public void testDivision() {
		fail("Not yet implemented");
	}

}
