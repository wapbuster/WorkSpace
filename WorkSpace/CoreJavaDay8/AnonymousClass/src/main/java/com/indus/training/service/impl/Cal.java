package com.indus.training.service.impl;

import com.indus.training.service.Icalc;

public class Cal implements Icalc {

	public double addition(double param1, double param2) {
		
		double result = 0.0;

		result = param1 + param2;

		return result;
	}

}
