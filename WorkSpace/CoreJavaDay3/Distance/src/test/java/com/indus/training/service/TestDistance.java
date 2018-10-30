package com.indus.training.service;

import com.indus.training.domain.DistanceInput;
import com.indus.training.domain.DistanceOutput;
import com.indus.training.service.impl.Distance;

import junit.framework.TestCase;

public class TestDistance extends TestCase {
	private Distance distanceObj = null;

	protected void setUp() throws Exception {
		distanceObj = new Distance();
	}

	protected void tearDown() throws Exception {
		distanceObj = null;
	}

	public void testDistanceScenario1() {
		// input
		DistanceInput distanceInObj = new DistanceInput();
		distanceInObj.setDistance(1.0);

		// expected result
		DistanceOutput expDistanceOutObj = new DistanceOutput();
		expDistanceOutObj.setDistance(1.0);
		expDistanceOutObj.setResult(0.6215040397762586);

		// actual result
		DistanceOutput actDistanceOutObj = distanceObj.distance(distanceInObj);

		// assertion
		assertEquals(expDistanceOutObj.getDistance(), actDistanceOutObj.getDistance(), 0);
		assertEquals(expDistanceOutObj.getResult(), actDistanceOutObj.getResult(), 0);
	}

	public void testDistanceScenario2() {
		// input
		DistanceInput distanceInObj = new DistanceInput();
		distanceInObj.setDistance(2.5);

		// expected result
		DistanceOutput expDistanceOutObj = new DistanceOutput();
		expDistanceOutObj.setDistance(2.5);
		expDistanceOutObj.setResult(1.5537600994406464);

		// actual result
		DistanceOutput actDistanceOutObj = distanceObj.distance(distanceInObj);

		// assertion
		assertEquals(expDistanceOutObj.getDistance(), actDistanceOutObj.getDistance(), 0);
		assertEquals(expDistanceOutObj.getResult(), actDistanceOutObj.getResult(), 0);
	}

	public void testDistanceScenario3() {
		// input
		DistanceInput distanceInObj = new DistanceInput();
		distanceInObj.setDistance(5.9);

		// expected result
		DistanceOutput expDistanceOutObj = new DistanceOutput();
		expDistanceOutObj.setDistance(5.9);
		expDistanceOutObj.setResult(3.666873834679926);

		// actual result
		DistanceOutput actDistanceOutObj = distanceObj.distance(distanceInObj);

		// assertion
		assertEquals(expDistanceOutObj.getDistance(), actDistanceOutObj.getDistance(), 0);
		assertEquals(expDistanceOutObj.getResult(), actDistanceOutObj.getResult(), 0);
	}
}