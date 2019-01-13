package com.indus.training.service.impl;

import com.indus.training.domain.CalciInput;
import com.indus.training.domain.CalciOutput;
import com.indus.training.service.ICalculator;

/**
 *
 * @author Sunny
 *
 */
public class Calculator implements ICalculator {

	/**
	 *
	 */
	public CalciOutput addition(CalciInput calInObj) {
		CalciOutput calOutObj = null;

		double param1 = calInObj.getParam1();
		double param2 = calInObj.getParam2();

		double result = param1 + param2;

		calOutObj = new CalciOutput();

		calOutObj.setParam1(param1);
		calOutObj.setParam2(param2);
		calOutObj.setResult(result);

		return calOutObj;
	}

	/**
	 *
	 */
	public CalciOutput subtract(CalciInput calInObj) {
		CalciOutput calOutObj = null;

		double param1 = calInObj.getParam1();
		double param2 = calInObj.getParam2();

		double result = param1 - param2;

		calOutObj = new CalciOutput();

		calOutObj.setParam1(param1);
		calOutObj.setParam2(param2);
		calOutObj.setResult(result);

		return calOutObj;
	}

	/**
	 *
	 */
	public CalciOutput multiply(CalciInput calInObj) {
		CalciOutput calOutObj = null;

		double param1 = calInObj.getParam1();
		double param2 = calInObj.getParam2();

		double result = param1 * param2;

		calOutObj = new CalciOutput();

		calOutObj.setParam1(param1);
		calOutObj.setParam2(param2);
		calOutObj.setResult(result);

		return calOutObj;
	}

	/**
	 *
	 */
	public CalciOutput division(CalciInput calInObj) {
		CalciOutput calOutObj = null;

		double param1 = calInObj.getParam1();
		double param2 = calInObj.getParam2();

		double result = param1 / param2;

		calOutObj = new CalciOutput();

		calOutObj.setParam1(param1);
		calOutObj.setParam2(param2);
		calOutObj.setResult(result);

		return calOutObj;
	}

}
