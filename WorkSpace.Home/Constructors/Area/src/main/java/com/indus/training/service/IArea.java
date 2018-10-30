package com.indus.training.service;
/**
 * 
 */
import com.indus.training.domain.AreaInput;
import com.indus.training.domain.AreaOutput;
/**
 * 
 * @author sunnyhith
 *
 */
public interface IArea {
/**
 * 
 * @param areaInObj
 * @return
 */
	public AreaOutput area(AreaInput areaInObj);
}
