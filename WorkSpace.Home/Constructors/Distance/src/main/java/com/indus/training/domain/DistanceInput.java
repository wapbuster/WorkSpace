package com.indus.training.domain;

public class DistanceInput {

	private double distance;

	public DistanceInput(double distance) {
		this.distance = distance;
	}

	public double getDistance() {
		return distance;
	}

	
	

	@Override
	public String toString() {
		return "DistanceInput [distance=" + distance + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(distance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DistanceInput other = (DistanceInput) obj;
		if (Double.doubleToLongBits(distance) != Double.doubleToLongBits(other.distance))
			return false;
		return true;
	}
	
	

}
