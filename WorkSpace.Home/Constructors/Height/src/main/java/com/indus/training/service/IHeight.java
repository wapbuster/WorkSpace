package com.indus.training.service;
/**
 * 
 */
import com.indus.training.domain.HeightInput;
import com.indus.training.domain.HeightOutput;
/**
 * 
 * @author sunnyhith
 *
 */
public interface IHeight {
/**
 * 
 * @param heightInObj
 * @return
 */
	public HeightOutput height(HeightInput heightInObj);
}
