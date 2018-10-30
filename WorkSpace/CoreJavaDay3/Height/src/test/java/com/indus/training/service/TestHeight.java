package com.indus.training.service;

import com.indus.training.domain.HeightInput;
import com.indus.training.domain.HeightOutput;
import com.indus.training.service.impl.Height;

import junit.framework.TestCase;

public class TestHeight extends TestCase {
	private Height heightObj = null;

	protected void setUp() throws Exception {
		heightObj = new Height();	//object in heap .
	}

	protected void tearDown() throws Exception {
		heightObj = null;
	}

	public void testHeightScenario1() {	//stored in stack memory when the method is called.
		// input
		HeightInput heightInObj = new HeightInput();
		heightInObj.setHeight(1.0);	//into the stack

		// expected result
		HeightOutput expHeightOutObj = new HeightOutput();	//object in to the heap memory
		expHeightOutObj.setHeight(1.0);		//into the stack	
		expHeightOutObj.setResult(12.0);	//into the stack

		// actual result
		HeightOutput actHeightOutObj = heightObj.height(heightInObj);

		// assertion
		assertEquals(expHeightOutObj.getHeight(), actHeightOutObj.getHeight(), 0);
		assertEquals(expHeightOutObj.getResult(), actHeightOutObj.getResult(), 0);
	}

	public void testHeightScenario2() {
		// input
		HeightInput heightInObj = new HeightInput();
		heightInObj.setHeight(4.2);

		// expected result
		HeightOutput expHeightOutObj = new HeightOutput();
		expHeightOutObj.setHeight(4.2);
		expHeightOutObj.setResult(50.400000000000006);

		// actual result
		HeightOutput actHeightOutObj = heightObj.height(heightInObj);

		// assertion
		assertEquals(expHeightOutObj.getHeight(), actHeightOutObj.getHeight(), 0);
		assertEquals(expHeightOutObj.getResult(), actHeightOutObj.getResult(), 0);
	}

	public void testHeightScenario3() {
		// input
		HeightInput heightInObj = new HeightInput();
		heightInObj.setHeight(6.2);

		// expected result
		HeightOutput expHeightOutObj = new HeightOutput();
		expHeightOutObj.setHeight(6.2);
		expHeightOutObj.setResult(74.4);

		// actual result
		HeightOutput actHeightOutObj = heightObj.height(heightInObj);

		// assertion
		assertEquals(expHeightOutObj.getHeight(), actHeightOutObj.getHeight(), 0);
		assertEquals(expHeightOutObj.getResult(), actHeightOutObj.getResult(), 0);
	}
}
