package com.indus.training.main.impl;

import com.indus.training.main.IArraysExample;

public class ArraysExample implements IArraysExample {

	public double add(double[][] array1, double[][] array2) {
		double[][] arrayResult = new double[array1.length][array2.length];
		for(int i=0; i<array1.length;i++) {
			for(int j=0; j<array2.length;j++) {
				arrayResult[i][j] = array1[i][j] + array2[i][j];
			}
				
		}
		return arrayResult[array1.length][array1.length];
	}

//	public double add(double[] args) {
//		double result = 0.0;
//		for (int i = 0; i < args.length; i++) {
//			result = result + args[i];
//		}
//		return result;
//	}

//	public double add(double ... args) {
//		double result = 0.0;
//		for (int i = 0; i < args.length; i++) {
//			result = result + args[i];
//		}
//		
//		return result;
//	}
	
	

}
