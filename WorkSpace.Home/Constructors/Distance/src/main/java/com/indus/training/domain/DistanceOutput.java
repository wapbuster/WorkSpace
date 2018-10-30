package com.indus.training.domain;

public class DistanceOutput {

	private double distance;
	private double result;

	public DistanceOutput(double distance, double result) {
		this.distance = distance;
		this.result = result;
	}

	public double getDistance() {
		return distance;
	}

	public double getResult() {
		return result;
	}

	@Override
	public String toString() {
		return "DistanceOutput [distance=" + distance + ", result=" + result + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(distance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(this.result);
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
		DistanceOutput other = (DistanceOutput) obj;
		if (Double.doubleToLongBits(distance) != Double.doubleToLongBits(other.distance))
			return false;
		if (Double.doubleToLongBits(result) != Double.doubleToLongBits(other.result))
			return false;
		return true;
	}

	
}