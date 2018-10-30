package com.indus.training.service.impl;

import com.indus.tarining.domain.AreaInput;
import com.indus.tarining.domain.AreaOutput;
import com.indus.training.service.IArea;

/**
 * 
 * @author sunnyhith
 *
 */
public class Area implements IArea {
/**
 * 
 */
	public AreaOutput area(AreaInput areaInObj) {	//areaInObj stored in stack
		AreaOutput areaOutObj = null;	// areaOutObj is not declared.

		double side = areaInObj.getSide(); 	// a block in the top of the stack is created.

		double result = side * side; 	// new space is allocated in stack.

		areaOutObj = new AreaOutput();	//created in Heap memory and stack memory contains the reference for it.
		
		areaOutObj.setSide(side);	//// a block in the top of the stack is created.
		areaOutObj.setResult(result);	// a block in the top of the stack is created.
		return areaOutObj;
	}	//method is terminated. Memory block allocated for area() in stack becomes free.

}
