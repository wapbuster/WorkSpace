package com.indus.training.service.impl;

import com.indus.training.domain.SciCalInput;
import com.indus.training.domain.SciCalOutput;
import com.indus.training.service.ISciCal;

public class SciCal implements ISciCal {

	public SciCalOutput sciCal(SciCalInput sciCalInObj) {
		SciCalOutput sciCalOutObj = null;

		double sciCal = sciCalInObj.getSciCal();

		double result = Math.toRadians(sciCal);
		result = Math.cos(result);

		sciCalOutObj = new SciCalOutput();

		sciCalOutObj.setSciCal(sciCal);
		sciCalOutObj.setResult(result);

		return sciCalOutObj;
	}

}
