package com.indus.training.service;

import com.indus.training.domain.CalcInput;
import com.indus.training.domain.CalcOutput;

public interface ICalc {
	
	public CalcOutput addition(CalcInput calInObj);
	
	public CalcOutput multiply(CalcInput calInObj);

}
