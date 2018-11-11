package com.indus.training.core.service;

import com.indus.training.core.domain.Employee;
import com.indus.training.core.exception.IndusException;
import com.indus.training.core.impl.EmployeeDAO;

import junit.framework.TestCase;

public class TestEmployee extends TestCase {
	private EmployeeDAO empObj = null;

	protected void setUp() throws Exception {
		empObj = new EmployeeDAO();
	}

	protected void tearDown() throws Exception {
		empObj = null;
	}

	public void testCreateER() throws IndusException {
		// Input
		Employee eDetailsObj = new Employee();
		eDetailsObj.setfName("Sai");
		eDetailsObj.setmName("Sunnyhith");
		eDetailsObj.setlName("Nandamuri");
		eDetailsObj.setAge("23");
		eDetailsObj.setEmpID("6381278");
		eDetailsObj.setEmail("snandamuri@albany.edu");
		eDetailsObj.setpNum("5182480537");

		// Expected Output
		String expResult = ("Sai Sunnyhith Nandamuri 23 6381278 snandamuri@albany.edu 5182480537");

		// Actual Output

		empObj.createER(eDetailsObj);

		// assertion
		assertEquals(expResult, "");
	}

	public void testReadER() throws IndusException {
		// Input
		Employee eDetailsObj = new Employee();
		eDetailsObj.setfName("Sai");
		eDetailsObj.setmName("Sunnyhith");
		eDetailsObj.setlName("Nandamuri");
		eDetailsObj.setAge("23");
		eDetailsObj.setEmpID("6381278");
		eDetailsObj.setEmail("snandamuri@albany.edu");
		eDetailsObj.setpNum("5182480537");

		// Expected Output
		String expResult = ("Sai Sunnyhith Nandamuri 23 6381278 snandamuri@albany.edu 5182480537");

		// Actual Output

		Employee actResult = empObj.readER(eDetailsObj);

		// assertion
		assertEquals(expResult, actResult);
	}

	public void testUpdateER() {
		fail("Not yet implemented");
	}

	public void testDeleteER() {
		fail("Not yet implemented");
	}

}
