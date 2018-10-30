package com.indus.training.height.impl;

import com.indus.training.height.IHeight;

public class Height implements IHeight {

	public double inchToFeet(double value) {
		double result = 0.0;

		result = value / 12.0;

		return result;
	}

	public double feetToInch(double value) {
		double result = 0.0;

		result = value * 12.0;

		return result;
	}

}
