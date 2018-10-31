package com.indus.training.matrix;

import static org.junit.Assert.assertArrayEquals;

import com.indus.training.matrix.impl.Matrix;

import junit.framework.TestCase;

public class TestMatrix extends TestCase {
	private Matrix matObj = null;

	protected void setUp() throws Exception {
		matObj = new Matrix();
	}

	protected void tearDown() throws Exception {
		matObj = null;
	}

	public void testAddition() {
		/*
		 * double param1[][] = new double[3][3]; double param2[][] = new double[3][3];
		 * int rows = 3, columns = 3;
		 */

		// input

		double[][] param1 = { { 2, 3, 4 }, { 5, 2, 3 }, { 1, 2, 3, } };
		double[][] param2 = { { -4, 5, 3 }, { 5, 6, 3 }, { 3, 2, 1 } };

		// expected Result
//		double[] expRow1 = { -2, 8, 7 };
//		double[] expRow2 = { 10, 8, 6 };
//		double[] expRow3 = { 4, 4, 4 };

		double[][] expResult = { { -2, 8, 7 }, { 10, 8, 6 }, { 4, 4, 4 } };
		
		// actual result
		double[][] actResult = matObj.addition(param1, param2);

		// assertion
		for (int i = 0; i < actResult.length; i++) {
			assertArrayEquals(expResult[i], actResult[i], 0);
		}
		

	}

}
