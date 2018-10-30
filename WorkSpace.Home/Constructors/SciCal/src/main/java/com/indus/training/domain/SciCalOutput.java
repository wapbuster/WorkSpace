package com.indus.training.domain;

public class SciCalOutput {

	private double sciCal;
	private double result;

	public SciCalOutput(double sciCal, double result) {
		this.sciCal = sciCal;
		this.result = result;
	}

	public double getSciCal() {
		return sciCal;
	}

	public double getResult() {
		return result;
	}

}