package com.indus.training.service.impl;

import com.indus.training.domain.CalcInput;
import com.indus.training.domain.CalcOutput;

public class Area extends Calc {
	private Calc cal = new Calc();

	public CalcOutput square(CalcInput calInObj) {
		CalcOutput calOutObj = null;

		double side = calInObj.getParam1();

		CalcOutput result = cal.multiply(calInObj);

		calOutObj = new CalcOutput(side, result);
		return calOutObj;
	}

}
