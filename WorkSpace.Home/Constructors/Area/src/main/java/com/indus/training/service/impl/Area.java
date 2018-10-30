package com.indus.training.service.impl;

import com.indus.training.domain.AreaInput;
import com.indus.training.domain.AreaOutput;
import com.indus.training.service.IArea;

public class Area implements IArea {

	public AreaOutput area(AreaInput areaInObj) {
		AreaOutput areaOutObj = null; // areaOutObj is not declared.

		double side = areaInObj.getSide(); // a block in the top of the stack is created.

		double result = side * side; // new space is allocated in stack.

		areaOutObj = new AreaOutput(side, result); // created in Heap memory and stack memory contains the reference for
													// it.

		return areaOutObj;
	} // method is terminated. Memory block allocated for area() in stack becomes
		// free.
}
