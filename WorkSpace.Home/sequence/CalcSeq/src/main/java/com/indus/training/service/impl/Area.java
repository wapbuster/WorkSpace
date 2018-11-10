package com.indus.training.service.impl;

public class Area extends Calc {

	private Calc calc = new Calc();

	public double square(double side) {
		double result = 0.0;

		result = calc.multiply(side, side);

		return result;
	}

	public double rectangle(double length, double breadth) {
		double result = 0.0;

		result = calc.multiply(length, breadth);

		return result;
	}

	public double circle(double radius) {
		double result = 0.0;
		double pi = 3.14;

		result = calc.multiply(pi, calc.multiply(radius, radius));

		return result;
	}

}
