package com.indus.training.service.impl;

import com.indus.training.domain.CalcInput;
import com.indus.training.domain.CalcOutput;

public class DistConv extends Calc {

	private Calc cal = new Calc();
	
	public CalcOutput kmToMiles(CalcInput calInObj) {
		CalcOutput result = null;

		result = cal.division(calInObj);

		return result;
	}
	
	public CalcOutput milesToKm(CalcInput calInObj) {
		CalcOutput result = null;

		result = cal.multiply(calInObj);

		return result;
	}
	
}
