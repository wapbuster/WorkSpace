package com.indus.training.scical.impl;

import com.indus.training.scical.ISciCal;
import java.lang.Math;

public class SciCal implements ISciCal {

	public double tan(double value) {
		double result = 0.0;
		result = Math.toRadians(value);
		result = Math.tan(result);
		return result;
	}

	public double cos(double value) {
		double result = 0.0;
		result = Math.toRadians(value);
		result = Math.cos(result);
		return result;
	}

	public double sin(double value) {
		double result = 0.0;
		result = Math.toRadians(value);
		result = Math.sin(result);
		return result;
	}

	public double sqRoot(double value) {
		double result = 0.0;
		result = Math.sqrt(value);
		return result;
	}

}
