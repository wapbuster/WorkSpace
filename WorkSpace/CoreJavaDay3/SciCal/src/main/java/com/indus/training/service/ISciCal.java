package com.indus.training.service;
/**
 * 
 */
import com.indus.training.domain.SciCalInput;
import com.indus.training.domain.SciCalOutput;
/**
 * 
 * @author sunnyhith
 *
 */
public interface ISciCal {
	/**
	 * 
	 * @param sciCalInObj
	 * @return
	 */
	public SciCalOutput sciCal(SciCalInput sciCalInObj);

}