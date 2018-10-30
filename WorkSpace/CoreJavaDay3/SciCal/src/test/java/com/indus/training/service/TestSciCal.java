package com.indus.training.service;

import com.indus.training.domain.SciCalInput;
import com.indus.training.domain.SciCalOutput;
import com.indus.training.service.impl.SciCal;

import junit.framework.TestCase;

public class TestSciCal extends TestCase {
	private SciCal sciCalObj = null;

	protected void setUp() throws Exception {
		sciCalObj = new SciCal();
	}

	protected void tearDown() throws Exception {
		sciCalObj = null;
	}

	public void testSciCalScenario1() {
		// input
		SciCalInput sciCalInObj = new SciCalInput();
		sciCalInObj.setSciCal(180.0);

		// expected result
		SciCalOutput expSciCalOutObj = new SciCalOutput();
		expSciCalOutObj.setSciCal(180.0);
		expSciCalOutObj.setResult(-1.0);

		// actual result
		SciCalOutput actSciCalOutObj = sciCalObj.sciCal(sciCalInObj);

		// assertion
		assertEquals(expSciCalOutObj.getSciCal(), actSciCalOutObj.getSciCal(), 0);
		assertEquals(expSciCalOutObj.getResult(), actSciCalOutObj.getResult(), 0);
	}

	public void testSciCalScenario2() {
		// input
		SciCalInput sciCalInObj = new SciCalInput();
		sciCalInObj.setSciCal(0.0);

		// expected result
		SciCalOutput expSciCalOutObj = new SciCalOutput();
		expSciCalOutObj.setSciCal(0.0);
		expSciCalOutObj.setResult(1.0);

		// actual result
		SciCalOutput actSciCalOutObj = sciCalObj.sciCal(sciCalInObj);

		// assertion
		assertEquals(expSciCalOutObj.getSciCal(), actSciCalOutObj.getSciCal(), 0);
		assertEquals(expSciCalOutObj.getResult(), actSciCalOutObj.getResult(), 0);
	}

	
}