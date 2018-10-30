package com.indus.training.service;

/**
 * 
 */
import com.indus.training.domain.MassInput;
import com.indus.training.domain.MassOutput;

/**
 * 
 * @author sunnyhith
 *
 */
public interface IMass {
	/**
	 * 
	 * @param massInObj
	 * @return
	 */
	public MassOutput mass(MassInput massInObj);

}