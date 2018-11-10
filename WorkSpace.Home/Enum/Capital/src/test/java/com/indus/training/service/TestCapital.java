package com.indus.training.service;

import com.indus.training.service.impl.Capital;

import junit.framework.TestCase;

public class TestCapital extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetCapital() {
		// expresult
		String expResult = "New Delhi";

		// actResult
		String actResult = Capital.India.getCapital();

		// assertion
		assertEquals(expResult, actResult);

	}

}
