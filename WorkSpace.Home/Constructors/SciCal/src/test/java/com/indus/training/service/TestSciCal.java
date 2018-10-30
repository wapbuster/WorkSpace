package com.indus.training.service;

import com.indus.training.domain.SciCalInput;
import com.indus.training.domain.SciCalOutput;
import com.indus.training.service.impl.SciCal;

import junit.framework.TestCase;

public class TestSciCal extends TestCase {

	private SciCal sciCalObj = null;

	protected void setUp() throws Exception {
		sciCalObj = new SciCal();	//sciCalObj in stack and SciCal in Heap.
	}

	protected void tearDown() throws Exception {
		sciCalObj = null;
	}

	public void testSciCalScenario1() {	//stored in stack memory when the method is called.

		// input
		SciCalInput sciCalInObj = new SciCalInput(180.0);	//sciCalInObj in stack and SciCalInput in Heap.

		// expected results
		SciCalOutput expSciCalOutObj = new SciCalOutput(180.0,-1.0);

		// actual results
		SciCalOutput actSciCalOutObj = sciCalObj.sciCal(sciCalInObj);	//in heap as object is called.

		// assertion
		assertEquals(expSciCalOutObj.getSciCal(), actSciCalOutObj.getSciCal(), 0);
		assertEquals(expSciCalOutObj.getResult(), actSciCalOutObj.getResult(), 0);
	}

	public void testSciCalScenario2() {

		// input
		SciCalInput sciCalInObj = new SciCalInput(0.0);

		// expected results
		SciCalOutput expSciCalOutObj = new SciCalOutput(0.0,1.0);

		// actual results
		SciCalOutput actSciCalOutObj = sciCalObj.sciCal(sciCalInObj);

		// assertion
		assertEquals(expSciCalOutObj.getSciCal(), actSciCalOutObj.getSciCal(), 0);
		assertEquals(expSciCalOutObj.getResult(), actSciCalOutObj.getResult(), 0);
	}



}

