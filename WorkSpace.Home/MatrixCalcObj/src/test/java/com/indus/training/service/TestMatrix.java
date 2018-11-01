package com.indus.training.service;

import com.indus.training.domain.MatrixInput;
import com.indus.training.domain.MatrixOutput;
import com.indus.training.service.impl.Matrix;

import junit.framework.TestCase;

public class TestMatrix extends TestCase {
	private Matrix matrixObj = null;

	protected void setUp() throws Exception {
		matrixObj = new Matrix();
	}

	protected void tearDown() throws Exception {
		matrixObj = null;
	}

	public void testAddition() {
		double[][] param1 = { { 2.0, 3.0, 4.0 }, { 5.0, 2.0, 3.0 }, { 1.0, 2.0, 3.0, } };
		double[][] param2 = { { -4.0, 5.0, 3.0 }, { 5.0, 6.0, 3.0 }, { 3.0, 2.0, 1.0 } };
		double[][] expResult = { { -2.0, 8.0, 7.0 }, { 10.0, 8.0, 6.0 }, { 4.0, 4.0, 4.0 } };

		// input
		MatrixInput matrixInObj = new MatrixInput(param1, param2);

		// Expected Output
		MatrixOutput expMatrixOutObj = new MatrixOutput(param1, param2, expResult);

		// Actual Result
		MatrixOutput actMatrixOutput = matrixObj.addition(matrixInObj);
		
		//assertion
		assertEquals(expMatrixOutObj, actMatrixOutput);

	}

}
