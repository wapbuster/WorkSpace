package com.indus.training.domain;

public class MatrixInput {

	private double param1[][];
	private double parma2[][];

	public MatrixInput(double param1[][], double parma2[][]) {
		this.param1 = param1;
		this.parma2 = parma2;
	}

	public double[][] getParam1() {
		return param1;
	}

	public double[][] getParma2() {
		return parma2;
	}

}
