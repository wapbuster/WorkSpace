package com.indus.training.service.impl;

public class SciCal extends Cal {

	public double cos(double param1) {
		
		double result = 0.0;
		
		result = Math.toRadians(param1);
		result = Math.cos(result);
		
		return result;
	}
}