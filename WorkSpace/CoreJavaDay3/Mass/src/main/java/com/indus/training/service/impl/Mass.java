package com.indus.training.service.impl;

import com.indus.training.domain.MassInput;
import com.indus.training.domain.MassOutput;
import com.indus.training.service.IMass;

public class Mass implements IMass {

	public MassOutput mass(MassInput massInObj) {
		MassOutput massOutObj = null;

		double mass = massInObj.getMass();	//into the stack

		double result = mass * 2.20462;	//into the stack

		massOutObj = new MassOutput();	//into the heap

		massOutObj.setMass(mass);	//into the stack
		massOutObj.setResult(result);	//into the stack

		return massOutObj;
	}	//garbage collected after method ends

}