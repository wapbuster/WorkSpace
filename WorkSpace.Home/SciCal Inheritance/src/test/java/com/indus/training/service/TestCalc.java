package com.indus.training.service;

import com.indus.training.domain.CalcInput;
import com.indus.training.domain.CalcOutput;
import com.indus.training.service.impl.Calc;
import com.indus.training.service.impl.SciCal;

import junit.framework.TestCase;

public class TestCalc extends TestCase {

	// private Calc calcObj = null;
	private SciCal sciCalObj = null;
	//private Cal calObj = null;

	protected void setUp() throws Exception {
		// calcObj = new Calc();
		sciCalObj = new SciCal();
	}

	protected void tearDown() throws Exception {
		//calcObj = null;
		sciCalObj = null;

	}

	public void testAdditionSenario1() {

		// input
		CalcInput calcInObj = new CalcInput(1.0, 2.0);

		// expected results
		CalcOutput expCalOutObj = new CalcOutput(1.0, 2.0, 3.0);

		// actual results
		CalcOutput actCalOutObj = sciCalObj.addition(calcInObj);

		// assertion
		assertEquals(expCalOutObj.getParam1(), actCalOutObj.getParam1(), 0);
		assertEquals(expCalOutObj.getParam2(), actCalOutObj.getParam2(), 0);
		assertEquals(expCalOutObj.getResult(), actCalOutObj.getResult(), 0);

	}

	public void testCosSenario1() {

		// input
		CalcInput calcInObj = new CalcInput(180.0);

		// expected results
		CalcOutput expCalOutObj = new CalcOutput(180.0, -1.0);

		// actual results
		CalcOutput actCalOutObj = sciCalObj.cos(calcInObj);

		// assertion
		assertEquals(expCalOutObj.getParam1(), actCalOutObj.getParam1(), 0);
		assertEquals(expCalOutObj.getParam2(), actCalOutObj.getParam2(), 0);
		assertEquals(expCalOutObj.getResult(), actCalOutObj.getResult(), 0);

	}
}
