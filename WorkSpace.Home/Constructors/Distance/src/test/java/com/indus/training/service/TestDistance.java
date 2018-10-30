package com.indus.training.service;

import com.indus.training.domain.DistanceInput;
import com.indus.training.domain.DistanceOutput;
import com.indus.training.service.impl.Distance;

import junit.framework.TestCase;

public class TestDistance extends TestCase {

	private Distance distanceObj = null;

	protected void setUp() throws Exception {
		distanceObj = new Distance();	//distanceObj in stack and Distance in Heap.
	}

	protected void tearDown() throws Exception {
		distanceObj = null;
	}

	public void testDistanceScenario1() {	//stored in stack memory when the method is called.

		// input
		DistanceInput distanceInObj = new DistanceInput(1.0);	//distanceInObj in stack and DistanceInput in Heap.

		// expected results
		DistanceOutput expDistanceOutObj = new DistanceOutput(1.0,0.6215040397762586);

		// actual results
		DistanceOutput actDistanceOutObj = distanceObj.distance(distanceInObj);	//in heap as object is called.

		// assertion
		assertEquals(expDistanceOutObj.getDistance(), actDistanceOutObj.getDistance(), 0);
		assertEquals(expDistanceOutObj.getResult(), actDistanceOutObj.getResult(), 0);
	}

	public void testDistanceScenario2() {

		// input
		DistanceInput distanceInObj = new DistanceInput(2.5);
		//distanceInObj.setDistance(5.0);

		// expected results
		DistanceOutput expDistanceOutObj = new DistanceOutput(2.5,1.5537600994406464);
		/*expDistanceOutObj.setDistance(5.0);
		expDistanceOutObj.setResult(25.0);*/

		// actual results
		DistanceOutput actDistanceOutObj = distanceObj.distance(distanceInObj);

		// assertion
		assertEquals(expDistanceOutObj.getDistance(), actDistanceOutObj.getDistance(), 0);
		assertEquals(expDistanceOutObj.getResult(), actDistanceOutObj.getResult(), 0);
	}

	public void testDistanceScenario3() {

		// input
		DistanceInput distanceInObj = new DistanceInput(5.9);
		//distanceInObj.setDistance(5.0);

		// expected results
		DistanceOutput expDistanceOutObj = new DistanceOutput(5.9,3.666873834679926);
		/*
		 * expDistanceOutObj.setDistance(5.0); expDistanceOutObj.setResult(25.0);
		 */

		// actual results
		DistanceOutput actDistanceOutObj = distanceObj.distance(distanceInObj);

		// assertion
		assertEquals(expDistanceOutObj.getDistance(), actDistanceOutObj.getDistance(), 0);
		assertEquals(expDistanceOutObj.getResult(), actDistanceOutObj.getResult(), 0);
	}

}

