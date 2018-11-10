package com.indus.training.service.impl;

import com.indus.training.domain.CalcInput;
import com.indus.training.domain.CalcOutput;

public class Area extends Calc {
	private Calc cal = new Calc();

	public CalcOutput square(CalcInput calInObj) {
		CalcOutput result = null;

		result = cal.multiply(calInObj);

		return result;
	}

	public CalcOutput rectangle(CalcInput calInObj) {
		CalcOutput calOutObj = null;

		calOutObj = cal.multiply(calInObj);

		return calOutObj;
	}

	public CalcOutput circle(CalcInput calInObj) {
		CalcOutput calOutObj = null;

		double pi = 3.14;
		// double radiussq = radius * radius;
		CalcInput calInObjLocal = new CalcInput(calInObj.getParam1(), calInObj.getParam1());

		calOutObj = cal.multiply(calInObjLocal);
		calInObjLocal = new CalcInput(calOutObj.getResult(), pi);

		calOutObj = cal.multiply(calInObjLocal);
		return calOutObj;
	}

}
