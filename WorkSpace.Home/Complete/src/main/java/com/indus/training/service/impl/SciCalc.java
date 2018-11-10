package com.indus.training.service.impl;

import com.indus.training.domain.CalcInput;
import com.indus.training.domain.CalcOutput;

public class SciCalc {

	public CalcOutput sin(CalcInput sciCalInObj) {
		CalcOutput sciCalOutObj = null;

		double param1 = sciCalInObj.getParam1();

		double result = Math.toRadians(param1);
		result = Math.sin(result);

		sciCalOutObj = new CalcOutput(param1, result);

		return sciCalOutObj;
	}

	public CalcOutput cos(CalcInput sciCalInObj) {
		CalcOutput sciCalOutObj = null;

		double param1 = sciCalInObj.getParam1();

		double result = Math.toRadians(param1);
		result = Math.sin(result);

		sciCalOutObj = new CalcOutput(param1, result);

		return sciCalOutObj;
	}
	
	public CalcOutput tan(CalcInput sciCalInObj) {
		CalcOutput sciCalOutObj = null;

		double param1 = sciCalInObj.getParam1();

		double result = Math.toRadians(param1);
		result = Math.tan(result);

		sciCalOutObj = new CalcOutput(param1, result);

		return sciCalOutObj;
	}
	
	public CalcOutput sqRoot(CalcInput sciCalInObj) {
		CalcOutput sciCalOutObj = null;

		double param1 = sciCalInObj.getParam1();

		//double result = Math.toRadians(param1);
		double result = Math.sqrt(param1);

		sciCalOutObj = new CalcOutput(param1, result);

		return sciCalOutObj;
	}
}

