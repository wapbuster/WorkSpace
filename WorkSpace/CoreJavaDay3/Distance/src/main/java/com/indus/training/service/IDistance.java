package com.indus.training.service;
/**
 * 
 */
import com.indus.training.domain.DistanceInput;
import com.indus.training.domain.DistanceOutput;
/**
 * 
 * @author sunnyhith
 *
 */
public interface IDistance {
	/**
	 * 
	 * @param distanceInObj
	 * @return
	 */
	public DistanceOutput distance(DistanceInput distanceInObj);

}
