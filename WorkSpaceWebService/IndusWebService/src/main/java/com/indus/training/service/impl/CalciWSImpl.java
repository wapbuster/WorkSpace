package com.indus.training.service.impl;

import javax.jws.WebService;

import com.indus.training.service.CalciInput;
import com.indus.training.service.CalciOutput;
import com.indus.training.service.CalciService;

@WebService(endpointInterface="com.indus.training.service.CalciService")
public class CalciWSImpl implements CalciService {

	public CalciOutput addition(CalciInput inputAruguments) {
		CalciOutput calOut = new CalciOutput();
		calOut.setOperation("Addition");
		calOut.setParam1(inputAruguments.getParam1());
		calOut.setParam2(inputAruguments.getParam2());
		calOut.setResult(inputAruguments.getParam1() + inputAruguments.getParam2());
		return calOut;
	}

}
