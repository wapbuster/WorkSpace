package com.indus.training.distance.impl;

import com.indus.training.distance.IDistance;

public class Distance implements IDistance {

	public double milesToKm(double mtok) {
		double km = 0.0;

		km = (mtok * 1.609);

		return km;
	}

	public double kmToMiles(double ktom) {
		double m = 0;

		m = (ktom / 1.609);

		return m;
	}

}
