package com.indus.training.service.impl;

import com.indus.training.domain.DistanceInput;
import com.indus.training.domain.DistanceOutput;
import com.indus.training.service.IDistance;

public class Distance implements IDistance {

	public DistanceOutput distance(DistanceInput distanceInObj) {
		DistanceOutput distanceOutObj = null; // distanceOutObj is not declared.

		double distance = distanceInObj.getDistance(); // a block in the top of the stack is created.

		double result = distance / 1.609; // new space is allocated in stack.

		distanceOutObj = new DistanceOutput(distance, result); // created in Heap memory and stack memory contains the reference for
													// it.

		return distanceOutObj;
	} // method is terminated. Memory block allocated for distance() in stack becomes
		// free.
}
