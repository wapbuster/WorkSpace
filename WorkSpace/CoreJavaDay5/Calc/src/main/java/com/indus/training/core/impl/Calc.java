package com.indus.training.core.impl;

import com.indus.training.core.ICalc;

public class Calc implements ICalc {

	public double addition(double param1, double param2) {
		double result = 0.0;

		result = param1 + param2;

		return result;
	}

	/*public double addition(double[] param) {
	double result = 0.0; 

	for (int i = 0; i < param.length; i++) {
		result = result + param[i];
	}

	return result;
}*/


public double addition(double ... param) {
	double result = 0.0;

	for (int i = 0; i < param.length; i++) {
		result = result + param[i];
	}

	return result;
}
	public double subtract(double param1, double param2) {
		double result = 0.0;

		result = param1 - param2;

		return result;
	}

	public double multiply(double param1, double param2) {
		double result = 0.0;

		result = param1 * param2;

		return result;
	}

	public double division(double param1, double param2) {
		double result = 0.0;

		result = param1 / param2;

		return result;
	}

	public double addition(double param1, double param2, double param3) {
		double result = 0.0;

		result = param1 + param2 + param3;

		return result;

	}

	
}
