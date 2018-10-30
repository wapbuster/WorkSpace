package com.indus.training.mass.impl;

import com.indus.training.mass.IMass;

public class Mass implements IMass {

	public double kgToPound(double ktop) {
		double pound = 0.0;

		pound = ktop * 2.20462;

		return pound;
	}

	public double poundToKg(double ptok) {
		double kg = 0.0;

		kg = ptok * 0.453592;

		return kg;
	}

}
