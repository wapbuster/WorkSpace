package com.indus.training.service;

import com.indus.training.domain.CalciInput;
import com.indus.training.domain.CalciOutput;
import com.indus.training.service.impl.Calculator;

import junit.framework.TestCase;

public class TestCalculotor extends TestCase {

	private Calculator calObj = null;

	protected void setUp() throws Exception {
		calObj = new Calculator();
	}

	protected void tearDown() throws Exception {
		calObj = null;
	}

	public void testAdditionSenario1() {
		// Input

		CalciInput calInObj = new CalciInput();

		calInObj.setParam1(10.0);
		calInObj.setParam2(20.0);

		// Expected Result

		CalciOutput expCalOutObj = new CalciOutput();
		expCalOutObj.setParam1(10.0);
		expCalOutObj.setParam2(20.0);
		expCalOutObj.setResult(30.0);

		// Acutal Result

		CalciOutput actCalOutObj = calObj.addition(calInObj);

		// assertion
		assertEquals(expCalOutObj.getParam1(), actCalOutObj.getParam1(), 0);
		assertEquals(expCalOutObj.getParam2(), actCalOutObj.getParam2(), 0);
		assertEquals(expCalOutObj.getResult(), actCalOutObj.getResult(), 0);

	}

}
