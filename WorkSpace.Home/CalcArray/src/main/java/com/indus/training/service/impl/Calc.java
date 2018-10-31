package com.indus.training.service.impl;

import com.indus.training.domain.CalcInput;
import com.indus.training.domain.CalcOutput;
import com.indus.training.service.ICalc;

public class Calc implements ICalc {

	public CalcOutput addition(CalcInput calcInObj) {
		CalcOutput calcOutObj = null;

		double param[] = calcInObj.getParam();

		double result = 0.0;

		for (int i = 0; i < param.length; i++) {
			result = result + param[i];
		}

		calcOutObj = new CalcOutput();

		calcOutObj.setParam(param);
		calcOutObj.setResult(result);

		return calcOutObj;
	}

}
