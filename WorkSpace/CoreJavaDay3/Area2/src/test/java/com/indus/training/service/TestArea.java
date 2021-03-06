package com.indus.training.service;

import com.indus.tarining.domain.AreaInput;
import com.indus.tarining.domain.AreaOutput;
import com.indus.training.service.impl.Area;

import junit.framework.TestCase;

public class TestArea extends TestCase {

	private Area areaObj = null;

	protected void setUp() throws Exception {
		areaObj = new Area();	//areaObj in stack and Area in Heap.
	}

	protected void tearDown() throws Exception {
		areaObj = null;
	}

	public void testAreaScenario1() {	//stored in stack memory when the method is called.

		// input
		AreaInput areaInObj = new AreaInput();	//areaInObj in stack and AreaInput in Heap.
		areaInObj.setSide(2.0);	//into the stack.

		// expected results
		AreaOutput expAreaOutObj = new AreaOutput();
		expAreaOutObj.setSide(2.0);	//into the stack
		expAreaOutObj.setResult(4.0); //into the stack

		// actual results
		AreaOutput actAreaOutObj = areaObj.area(areaInObj);	//in heap as object is called.

		// assertion
		assertEquals(expAreaOutObj.getSide(), actAreaOutObj.getSide(), 0);
		assertEquals(expAreaOutObj.getResult(), actAreaOutObj.getResult(), 0);
	}

	public void testAreaScenario2() {

		// input
		AreaInput areaInObj = new AreaInput();
		areaInObj.setSide(5.0);

		// expected results
		AreaOutput expAreaOutObj = new AreaOutput();
		expAreaOutObj.setSide(5.0);
		expAreaOutObj.setResult(25.0);

		// actual results
		AreaOutput actAreaOutObj = areaObj.area(areaInObj);

		// assertion
		assertEquals(expAreaOutObj.getSide(), actAreaOutObj.getSide(), 0);
		assertEquals(expAreaOutObj.getResult(), actAreaOutObj.getResult(), 0);
	}

	public void testAreaScenario3() {

		// input
		AreaInput areaInObj = new AreaInput();
		areaInObj.setSide(5.0);

		// expected results
		AreaOutput expAreaOutObj = new AreaOutput();
		expAreaOutObj.setSide(5.0);
		expAreaOutObj.setResult(25.0);

		// actual results
		AreaOutput actAreaOutObj = areaObj.area(areaInObj);

		// assertion
		assertEquals(expAreaOutObj.getSide(), actAreaOutObj.getSide(), 0);
		assertEquals(expAreaOutObj.getResult(), actAreaOutObj.getResult(), 0);
	}

}
