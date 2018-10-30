package com.indus.training.service.impl;

import com.indus.training.domain.MassInput;
import com.indus.training.domain.MassOutput;
import com.indus.training.service.IMass;

public class Mass implements IMass {

	public MassOutput mass(MassInput massInObj) {
		MassOutput massOutObj = null; // massOutObj is not declared.

		double mass = massInObj.getMass(); // a block in the top of the stack is created.

		double result = mass * 2.20462; // new space is allocated in stack.

		massOutObj = new MassOutput(mass, result); // created in Heap memory and stack memory contains the reference for
													// it.

		return massOutObj;
	} // method is terminated. Memory block allocated for mass() in stack becomes
		// free.
}
