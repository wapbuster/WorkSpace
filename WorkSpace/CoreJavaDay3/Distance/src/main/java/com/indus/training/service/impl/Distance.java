package com.indus.training.service.impl;

import com.indus.training.domain.DistanceInput;
import com.indus.training.domain.DistanceOutput;
import com.indus.training.service.IDistance;

public class Distance implements IDistance {

	public DistanceOutput distance(DistanceInput distanceInObj) {
		DistanceOutput distanceOutObj = null;

		double distance = distanceInObj.getDistance();

		double result = distance / 1.609;

		distanceOutObj = new DistanceOutput();

		distanceOutObj.setDistance(distance);
		distanceOutObj.setResult(result);

		return distanceOutObj;
	}

}
