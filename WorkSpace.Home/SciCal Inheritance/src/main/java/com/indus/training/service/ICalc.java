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
	public CalcOutput addition(CalcInput calcInObj);

	public CalcOutput subtract(CalcInput calcInObj);

	public CalcOutput multiply(CalcInput calcInObj);

	public CalcOutput division(CalcInput calcInObj);

	//public CalcOutput sin(CalcInput calcInObj);
}
