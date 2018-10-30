package com.indus.training.service;

import com.indus.training.domain.CalciInput;
import com.indus.training.domain.CalciOutput;

/**
 * 
 * @author sunnyhith
 *
 */

public interface ICalculator {

	/**
	 * 
	 * @param calInObj
	 * @return
	 */
	public CalciOutput addition(CalciInput calInObj);

	/**
	 * 
	 * @param calInObj
	 * @return
	 */

	public CalciOutput subtract(CalciInput calInObj);

	/**
	 * 
	 * @param calInObj
	 * @return
	 */

	public CalciOutput multiply(CalciInput calInObj);

	/**
	 * 
	 * @param calInObj
	 * @return
	 */

	public CalciOutput division(CalciInput calInObj);

}

