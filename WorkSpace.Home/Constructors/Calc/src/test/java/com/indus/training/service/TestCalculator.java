package com.indus.training.service;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.indus.training.domain.CalciInput;
import com.indus.training.domain.CalciOutput;
import com.indus.training.service.impl.Calculator;

import junit.framework.TestCase;

public class TestCalculator extends TestCase {

	private Calculator calObj = null;
	static Logger logger = Logger.getLogger(Calculator.class);
	

	protected void setUp() throws Exception {
		calObj = new Calculator(); // allocated in heap memory
	}

	protected void tearDown() throws Exception {
		calObj = null;
	}

	public void testAdditionSenario1() {
		// Input

		CalciInput calInObj = new CalciInput(10.0, 20.0); // in the heap memory

		// Expected Result

		CalciOutput expCalOutObj = new CalciOutput(10.0, 20.0, 30.0);

		// Actual Result

		CalciOutput actCalOutObj = calObj.addition(calInObj);

		// assertion
		assertEquals(expCalOutObj.getParam1(), actCalOutObj.getParam1(), 0);
		assertEquals(expCalOutObj.getParam2(), actCalOutObj.getParam2(), 0);
		assertEquals(expCalOutObj.getResult(), actCalOutObj.getResult(), 0);

	}

	public void testSubtractSenario1() {

		// Input

		CalciInput calInObj = new CalciInput(40.0, 20.0);

		/*
		 * calInObj.setParam1(10.0); calInObj.setParam2(20.0);
		 */

		// Expected Result

		CalciOutput expCalOutObj = new CalciOutput(40.0, 20.0, 20.0);
		/*
		 * expCalOutObj.setParam1(10.0); expCalOutObj.setParam2(20.0);
		 * expCalOutObj.setResult(30.0);
		 */
		// Actual Result

		CalciOutput actCalOutObj = calObj.subtract(calInObj);

		// assertion
		assertEquals(expCalOutObj.getParam1(), actCalOutObj.getParam1(), 0);
		assertEquals(expCalOutObj.getParam2(), actCalOutObj.getParam2(), 0);
		assertEquals(expCalOutObj.getResult(), actCalOutObj.getResult(), 0);

	}

	public void testMultiplySenario1() {
		// Input

		CalciInput calInObj = new CalciInput(10.0, 10.0);

		/*
		 * calInObj.setParam1(10.0); calInObj.setParam2(20.0);
		 */

		// Expected Result

		CalciOutput expCalOutObj = new CalciOutput(10.0, 10.0, 100.0);
		/*
		 * expCalOutObj.setParam1(10.0); expCalOutObj.setParam2(20.0);
		 * expCalOutObj.setResult(30.0);
		 */
		// Actual Result

		CalciOutput actCalOutObj = calObj.multiply(calInObj);

		// assertion
		assertEquals(expCalOutObj.getParam1(), actCalOutObj.getParam1(), 0);
		assertEquals(expCalOutObj.getParam2(), actCalOutObj.getParam2(), 0);
		assertEquals(expCalOutObj.getResult(), actCalOutObj.getResult(), 0);

	}

	public void testDivisionSenario1() {
		// Input
		DOMConfigurator.configure("log4j.xml");
		CalciInput calInObj = new CalciInput(00.0, 0.0);

		/*
		 * calInObj.setParam1(10.0); calInObj.setParam2(20.0);
		 */

		// Expected Result

		CalciOutput expCalOutObj = new CalciOutput(0.0, 0.0, 0.0);
		/*
		 * expCalOutObj.setParam1(10.0); expCalOutObj.setParam2(20.0);
		 * expCalOutObj.setResult(30.0);
		 */
		// Actual Result

		try {
			calObj.division(calInObj);
		} catch (ArithmeticException ex) {
			logger.error("Sorry, something wrong!", ex);

			CalciOutput actCalOutObj = calObj.division(calInObj);

			// assertion
			assertEquals(expCalOutObj.getParam1(), actCalOutObj.getParam1(), 0);
			assertEquals(expCalOutObj.getParam2(), actCalOutObj.getParam2(), 0);
			assertEquals(expCalOutObj.getResult(), actCalOutObj.getResult(), 0);

		}
	}
}
