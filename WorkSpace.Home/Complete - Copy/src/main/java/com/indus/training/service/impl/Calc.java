package com.indus.training.service.impl;

import com.indus.training.domain.CalcInput;
import com.indus.training.domain.CalcOutput;
import com.indus.training.service.ICalc;

public class Calc implements ICalc {

	public CalcOutput addition(CalcInput calInObj) {
		CalcOutput calOutObj = null;

		double param1 = calInObj.getParam1(); // allocated to stack memory
		double param2 = calInObj.getParam2(); // allocated to stack memory

		double result = param1 + param2; // allocated to stack memory

		calOutObj = new CalcOutput(param1, param2, result);
		return calOutObj;
	}

	public CalcOutput multiply(CalcInput calInObj) {
		CalcOutput calOutObj = null;

		double param1 = calInObj.getParam1();
		double param2 = calInObj.getParam2();

		double result = param1 * param2;

		calOutObj = new CalcOutput(param1, param2, result);
		return calOutObj;
	}

	public CalcOutput subtract(CalcInput calInObj) {
		CalcOutput calOutObj = null;

		double param1 = calInObj.getParam1();
		double param2 = calInObj.getParam2();

		double result = param1 - param2;

		calOutObj = new CalcOutput(param1, param2, result);
		return calOutObj;
	}

	public CalcOutput division(CalcInput calInObj) {
		CalcOutput calOutObj = null;

		double param1 = calInObj.getParam1();
		double param2 = calInObj.getParam2();

		double result = param1 / param2;

		calOutObj = new CalcOutput(param1, param2, result);
		return calOutObj;
	}

}
