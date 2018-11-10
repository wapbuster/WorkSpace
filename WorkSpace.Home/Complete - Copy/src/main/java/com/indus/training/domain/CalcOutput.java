package com.indus.training.domain;

public class CalcOutput {

	private double param1;
	private double param2;
	private double result;

	public CalcOutput() {
		super();
	}

	public CalcOutput(double param1, double param2, double result) {

		this.param1 = param1;
		this.param2 = param2;
		this.result = result;
	}

	public double getParam1() {
		return param1;
	}

	public double getParam2() {
		return param2;
	}

	public double getResult() {
		return result;
	}

	@Override
	public String toString() {
		return "" + result ;
	}

}
