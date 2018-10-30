package com.indus.training.service;

import com.indus.training.domain.MassInput;
import com.indus.training.domain.MassOutput;
import com.indus.training.service.impl.Mass;

import junit.framework.TestCase;

public class TestMass extends TestCase {
	private Mass massObj = null;

	protected void setUp() throws Exception {
		massObj = new Mass();	//object in heap.
	}

	protected void tearDown() throws Exception {
		massObj = null;
	}

	public void testMassScenario1() {
		// input
		MassInput massInObj = new MassInput();
		massInObj.setMass(1.0);	//into the stack

		// expected result
		MassOutput expMassOutObj = new MassOutput();
		expMassOutObj.setMass(1.0);	//into the stack
		expMassOutObj.setResult(2.20462);	//into the stack

		// actual result
		MassOutput actMassOutObj = massObj.mass(massInObj);	//into the heap

		// assertion
		assertEquals(expMassOutObj.getMass(), actMassOutObj.getMass(), 0);
		assertEquals(expMassOutObj.getResult(), actMassOutObj.getResult(), 0);
	}

	public void testMassScenario2() {
		// input
		MassInput massInObj = new MassInput();
		massInObj.setMass(12.0);

		// expected result
		MassOutput expMassOutObj = new MassOutput();
		expMassOutObj.setMass(12.0);
		expMassOutObj.setResult(26.455439999999996);

		// actual result
		MassOutput actMassOutObj = massObj.mass(massInObj);

		// assertion
		assertEquals(expMassOutObj.getMass(), actMassOutObj.getMass(), 0);
		assertEquals(expMassOutObj.getResult(), actMassOutObj.getResult(), 0);
	}

	public void testMassScenario3() {
		// input
		MassInput massInObj = new MassInput();
		massInObj.setMass(17.3);

		// expected result
		MassOutput expMassOutObj = new MassOutput();
		expMassOutObj.setMass(17.3);
		expMassOutObj.setResult(38.139925999999996);

		// actual result
		MassOutput actMassOutObj = massObj.mass(massInObj);

		// assertion
		assertEquals(expMassOutObj.getMass(), actMassOutObj.getMass(), 0);
		assertEquals(expMassOutObj.getResult(), actMassOutObj.getResult(), 0);
	}
}