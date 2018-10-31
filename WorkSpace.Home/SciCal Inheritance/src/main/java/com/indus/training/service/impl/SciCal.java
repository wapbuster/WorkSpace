package com.indus.training.service.impl;

import com.indus.training.domain.CalcInput;
import com.indus.training.domain.CalcOutput;
import com.indus.training.service.ICalc;

public class SciCal extends Calc implements ICalc {

	public CalcOutput cos(CalcInput calcInObj) {
		CalcOutput calcOutObj = null;

		double param1 = calcInObj.getParam1();

		double result = Math.toRadians(param1);
		result = Math.cos(result);

		calcOutObj = new CalcOutput(param1, result);

		return calcOutObj;
	}
	
	public CalcOutput sin(CalcInput calcInObj) {
		CalcOutput calcOutObj = null;

		double param1 = calcInObj.getParam1();

		double result = Math.toRadians(param1);
		result = Math.cos(result);

		calcOutObj = new CalcOutput(param1, result);

		return calcOutObj;
	}
	
	public CalcOutput tan(CalcInput calcInObj) {
		CalcOutput calcOutObj = null;

		double param1 = calcInObj.getParam1();

		double result = Math.toRadians(param1);
		result = Math.cos(result);

		calcOutObj = new CalcOutput(param1, result);

		return calcOutObj;
	}
	
	

}
