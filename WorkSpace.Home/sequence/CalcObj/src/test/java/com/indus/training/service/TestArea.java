package com.indus.training.service;

import com.indus.training.domain.CalcInput;
import com.indus.training.domain.CalcOutput;
import com.indus.training.service.impl.Area;

import junit.framework.TestCase;

public class TestArea extends TestCase {

	private Area areaObj = null;

	protected void setUp() throws Exception {
		areaObj = new Area();
	}

	protected void tearDown() throws Exception {
		areaObj = null;
	}

	public void testSquare() {
		// Input
		CalcInput calInObj = new CalcInput(10.0); // in the heap memory

		// Expected Result
		CalcOutput expCalOutObj = new CalcOutput(10.0, areaObj.multiply(calInObj));

		// Actual Result
		CalcOutput actCalOutObj = areaObj.square(calInObj);

		// assertion
		assertEquals(expCalOutObj.getParam1(), actCalOutObj.getParam1(), 0);
		assertEquals(expCalOutObj, actCalOutObj);
	}

	public void testAddition() {
		// Input
		CalcInput calInObj = new CalcInput(10.0, 20.0); // in the heap memory

		// Expected Result
		CalcOutput expCalOutObj = new CalcOutput(10.0, 20.0, 30.0);

		// Actual Result
		CalcOutput actCalOutObj = areaObj.addition(calInObj);

		// assertion
		assertEquals(expCalOutObj.getParam1(), actCalOutObj.getParam1(), 0);
		assertEquals(expCalOutObj.getParam2(), actCalOutObj.getParam2(), 0);
		assertEquals(expCalOutObj.getResult(), actCalOutObj.getResult(), 0);
	}

	public void testMultiply() {
		// Input
		CalcInput calInObj = new CalcInput(10.0, 25.0); // in the heap memory

		// Expected Result
		CalcOutput expCalOutObj = new CalcOutput(10.0, 25.0, 250.0);

		// Actual Result
		CalcOutput actCalOutObj = areaObj.multiply(calInObj);

		// assertion
		assertEquals(expCalOutObj.getParam1(), actCalOutObj.getParam1(), 0);
		assertEquals(expCalOutObj.getParam2(), actCalOutObj.getParam2(), 0);
		assertEquals(expCalOutObj.getResult(), actCalOutObj.getResult(), 0);
	}

}
