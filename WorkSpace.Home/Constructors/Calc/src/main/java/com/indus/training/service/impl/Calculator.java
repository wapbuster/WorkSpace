package com.indus.training.service.impl;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.indus.training.domain.CalciInput;
import com.indus.training.domain.CalciOutput;
import com.indus.training.service.ICalculator;

public class Calculator implements ICalculator {
	// static Logger logger = Logger.getLogger(Calculator.class);

	public CalciOutput addition(CalciInput calInObj) {

		CalciOutput calOutObj = null;

		double param1 = calInObj.getParam1(); // allocated to stack memory
		double param2 = calInObj.getParam2(); // allocated to stack memory

		double result = param1 + param2; // allocated to stack memory

		calOutObj = new CalciOutput(param1, param2, result); // allocated to heap memory

		return calOutObj;
	}

	public CalciOutput subtract(CalciInput calInObj) {
		CalciOutput calOutObj = null;

		double param1 = calInObj.getParam1();
		double param2 = calInObj.getParam2();

		double result = param1 - param2;

		calOutObj = new CalciOutput(param1, param2, result);

		return calOutObj;
	}

	public CalciOutput multiply(CalciInput calInObj) {
		CalciOutput calOutObj = null;

		double param1 = calInObj.getParam1();
		double param2 = calInObj.getParam2();

		double result = param1 * param2;

		calOutObj = new CalciOutput(param1, param2, result);

		return calOutObj;
	}

	public CalciOutput division(CalciInput calInObj) {
		// DOMConfigurator.configure("log4j.xml");
		CalciOutput calOutObj = null;

		double param1 = calInObj.getParam1();
		double param2 = calInObj.getParam2();

		double result = param1 / param2;
		calOutObj = new CalciOutput(param1, param2, result);

		return calOutObj;

	}

}
