package com.indus.training.ioc.impl;

import com.indus.training.ioc.ICalci;

public class Calci implements ICalci {

	public Double addtion(Double param1, Double param2) throws Exception {
		return param1 + param2;
	}

	public Double subtract(Double param1, Double param2) throws Exception {
		return param1 - param2;
	}

	public Double multiply(Double param1, Double param2) throws Exception {
		return param1 * param2;
	}

	public Double division(Double param1, Double param2) throws Exception {
		return param1 / param2;
	}

}
