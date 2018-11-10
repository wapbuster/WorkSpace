package com.indus.training.service;

import com.indus.training.service.impl.Month;

import junit.framework.TestCase;

public class TestEnum extends TestCase {
	Month month;

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetMonthNo() {
		// input
		
		// expResults
		int expResult = 6;
		
		// actResults
		int actResult = Month.June.getMonthNo();
		
		// assertion
		assertEquals(expResult, actResult);
	}

}
