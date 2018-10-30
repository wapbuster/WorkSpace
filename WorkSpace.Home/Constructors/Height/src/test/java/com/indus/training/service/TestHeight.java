package com.indus.training.service;

import com.indus.training.domain.HeightInput;
import com.indus.training.domain.HeightOutput;
import com.indus.training.service.impl.Height;

import junit.framework.TestCase;

public class TestHeight extends TestCase {

	private Height heightObj = null;

	protected void setUp() throws Exception {
		heightObj = new Height();	//heightObj in stack and Height in Heap.
	}

	protected void tearDown() throws Exception {
		heightObj = null;
	}

	public void testHeightScenario1() {	//stored in stack memory when the method is called.

		// input
		HeightInput heightInObj = new HeightInput(1.0);	//heightInObj in stack and HeightInput in Heap.
		//heightInObj.setHeight(2.0);	//into the stack.

		// expected results
		HeightOutput expHeightOutObj = new HeightOutput(1.0,12.0);
		/*expHeightOutObj.setHeight(2.0);	//into the stack
		expHeightOutObj.setResult(4.0); //into the stack
*/
		// actual results
		HeightOutput actHeightOutObj = heightObj.height(heightInObj);	//in heap as object is called.

		// assertion
		assertEquals(expHeightOutObj.getHeight(), actHeightOutObj.getHeight(), 0);
		assertEquals(expHeightOutObj.getResult(), actHeightOutObj.getResult(), 0);
	}

	public void testHeightScenario2() {

		// input
		HeightInput heightInObj = new HeightInput(6.2);
		

		// expected results
		HeightOutput expHeightOutObj = new HeightOutput(6.2,74.4);
		

		// actual results
		HeightOutput actHeightOutObj = heightObj.height(heightInObj);

		// assertion
		assertEquals(expHeightOutObj.getHeight(), actHeightOutObj.getHeight(), 0);
		assertEquals(expHeightOutObj.getResult(), actHeightOutObj.getResult(), 0);
	}

	public void testHeightScenario3() {

		// input
		HeightInput heightInObj = new HeightInput(4.2);
		//heightInObj.setHeight(5.0);

		// expected results
		HeightOutput expHeightOutObj = new HeightOutput(4.2,50.400000000000006);
		/*
		 * expHeightOutObj.setHeight(5.0); expHeightOutObj.setResult(25.0);
		 */

		// actual results
		HeightOutput actHeightOutObj = heightObj.height(heightInObj);

		// assertion
		assertEquals(expHeightOutObj.getHeight(), actHeightOutObj.getHeight(), 0);
		assertEquals(expHeightOutObj.getResult(), actHeightOutObj.getResult(), 0);
	}

}

