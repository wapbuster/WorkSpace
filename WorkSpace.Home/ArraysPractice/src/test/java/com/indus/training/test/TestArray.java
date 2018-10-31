package com.indus.training.test;


import static org.junit.Assert.assertArrayEquals;

import com.indus.training.main.impl.ArraysExample;

import junit.framework.TestCase;

public class TestArray extends TestCase {
	
	ArraysExample calObj = null;

	protected void setUp() throws Exception {
		calObj = new ArraysExample();
	}

	protected void tearDown() throws Exception {
		calObj = null;
	}
//
//	public void testAddDoubleArray() {
//		//input
//		double[] args = new double[5];
//		args[0] = 10;
//		args[1]= 10;
//		args[2]= 10;
//		args[3]= 10;
//		args[4]= 10;
//       //expected
//		
//		double result = 50;
//		//actual
//		
//		double actObj = calObj.add(args);
//		
//		//assertion
//		
//		assertEquals(result, actObj, 0);
//	}

//	public void testAddDoubleArrayVariableArgs() {
//		
//		double result = 100;
//		double actual = calObj.add(10.0,20.0,30.0,40.0);
//		assertEquals(result, actual, 0);
//		ass
//	}

	public void testArrayAddition() {
		//input
		
		double[][] array1 = {{1,1,1},{1,1,1}};
		double[][] array2 = {{1,1,1},{1,1,1}};
		//expected
		
		double[][] expOutput = {{2,2,2},{2,2,2}};
		
		//actual
		
		double actualOutput = calObj.add(array1, array2);
		
		System.out.println(actualOutput);
		
		//assertion
		
		assertEquals(expOutput, actualOutput);
	}
	
	
}
