package com.indus.training.domain;

import java.util.Arrays;

public class MatrixOutput {

	private double param1[][];
	private double parma2[][];
	private double result[][];

	public MatrixOutput(double[][] param1, double[][] parma2, double[][] result) {
		this.param1 = param1;
		this.parma2 = parma2;
		this.result = result;
	}

	public double[][] getParam1() {
		return param1;
	}

	public double[][] getParma2() {
		return parma2;
	}

	public double[][] getResult() {
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(param1);
		result = prime * result + Arrays.deepHashCode(parma2);
		result = prime * result + Arrays.deepHashCode(this.result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MatrixOutput other = (MatrixOutput) obj;
		if (!Arrays.deepEquals(param1, other.param1))
			return false;
		if (!Arrays.deepEquals(parma2, other.parma2))
			return false;
		if (!Arrays.deepEquals(result, other.result))
			return false;
		return true;
	}

}