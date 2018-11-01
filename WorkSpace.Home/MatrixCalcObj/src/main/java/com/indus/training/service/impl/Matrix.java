package com.indus.training.service.impl;

import com.indus.training.domain.MatrixInput;
import com.indus.training.domain.MatrixOutput;
import com.indus.training.service.IMatrix;

public class Matrix implements IMatrix {

	public MatrixOutput addition(MatrixInput matrixInObj) {
		MatrixOutput matrixOutObj = null;

		double[][] param1 = matrixInObj.getParam1();
		double[][] param2 = matrixInObj.getParma2();
		double result[][] = new double[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				result[i][j] = param1[i][j] + param2[i][j];
			}
		}

		matrixOutObj = new MatrixOutput(param1, param2, result);

		return matrixOutObj;
	}

	@Override
	public String toString() {
		return "Matrix [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
}
