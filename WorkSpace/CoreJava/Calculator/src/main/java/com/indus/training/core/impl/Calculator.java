package com.indus.training.core.impl;

import com.indus.training.core.ICalculator;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Calculator implements ICalculator {
	static Logger logger = Logger.getLogger(Calculator.class);

	public double addition(double param1, double param2) {

		double result = 0.0;

		result = param1 + param2;

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
		DOMConfigurator.configure("log4j.xml");
		double result = 0.0;
		try {

			result = param1 / param2;

		} catch (ArithmeticException ex) {
			logger.error("Sorry, something wrong!", ex);
		}
		return result;
	}

}
