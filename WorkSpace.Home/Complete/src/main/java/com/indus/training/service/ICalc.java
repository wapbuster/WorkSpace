package com.indus.training.service;

/**
 * 
 */
import com.indus.training.domain.CalcInput;
import com.indus.training.domain.CalcOutput;

/**
 * 
 * @author sunnyhith
 *
 */
public interface ICalc {
	/**
	 * 
	 * @param calInObj
	 * @return
	 */
	public CalcOutput addition(CalcInput calInObj);

	/**
	 * 
	 * @param calInObj
	 * @return
	 */
	public CalcOutput multiply(CalcInput calInObj);

	/**
	 * 
	 * @param calInObj
	 * @return
	 */
	public CalcOutput subtract(CalcInput calInObj);

	/**
	 * 
	 * @param calInObj
	 * @return
	 */
	public CalcOutput division(CalcInput calInObj);
}
