package com.indus.training.service.impl;

import com.indus.training.domain.HeightInput;
import com.indus.training.domain.HeightOutput;
import com.indus.training.service.IHeight;

public class Height implements IHeight {

	public HeightOutput height(HeightInput heightInObj) {
		HeightOutput heightOutObj = null; // heightOutObj is not declared.

		double height = heightInObj.getHeight(); // a block in the top of the stack is created.

		double result = height * 12; // new space is allocated in stack.

		heightOutObj = new HeightOutput(height, result); // created in Heap memory and stack memory contains the
															// reference for
		// it.

		return heightOutObj;
	} // method is terminated. Memory block allocated for height() in stack becomes
		// free.
}
