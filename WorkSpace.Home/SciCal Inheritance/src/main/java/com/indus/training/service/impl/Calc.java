package com.indus.training.service.impl;

import com.indus.training.domain.CalcInput;
import com.indus.training.domain.CalcOutput;
import com.indus.training.service.ICalc;

public class Calc implements ICalc {

	public CalcOutput addition(CalcInput calcInObj) {
		CalcOutput calcOutObj = null;

		double param1 = calcInObj.getParam1();
		double param2 = calcInObj.getParam2();

		double result = param1 + param2;

		calcOutObj = new CalcOutput(param1, param2, result);

		return calcOutObj;
	}

	public CalcOutput subtract(CalcInput calcInObj) {
		CalcOutput calcOutObj = null;

		double param1 = calcInObj.getParam1();
		double param2 = calcInObj.getParam2();

		double result = param1 - param2;

		calcOutObj = new CalcOutput(param1, param2, result);
		
		return calcOutObj;
	}

	public CalcOutput multiply(CalcInput calcInObj) {
		CalcOutput calcOutObj = null;

		double param1 = calcInObj.getParam1();
		double param2 = calcInObj.getParam2();

		double result = param1 * param2;

		calcOutObj = new CalcOutput(param1, param2, result);
		
		return calcOutObj;
	}

	public CalcOutput division(CalcInput calcInObj) {
		CalcOutput calcOutObj = null;

		double param1 = calcInObj.getParam1();
		double param2 = calcInObj.getParam2();

		double result = param1 / param2;

		calcOutObj = new CalcOutput(param1, param2, result);
		
		return calcOutObj;
	}

}
