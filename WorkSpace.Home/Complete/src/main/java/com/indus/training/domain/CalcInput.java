package com.indus.training.domain;

public class CalcInput {

	private double param1;
	private double param2;

	public CalcInput(double param1, double param2) {

		this.param1 = param1;
		this.param2 = param2;
	}

	public CalcInput(double param1) {

		this.param1 = param1;
	}

	public double getParam1() {
		return param1;
	}

	public double getParam2() {
		return param2;
	}

}
