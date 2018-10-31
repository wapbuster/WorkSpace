package com.indus.training.matrix.impl;

import com.indus.training.matrix.IMatrix;

public class Matrix implements IMatrix {

	public double[][] addition(double[][] param1, double[][] param2) {
		double result[][] = null;

		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
			result[i][j] = param1[i][j]+param2[i][j];
		}
		}

		return result;

	}
}