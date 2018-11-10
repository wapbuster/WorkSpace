package com.indus.training.domain;

public class CalcOutput {

	private double param1;
	private double param2;
	private CalcOutput result2;
	private double result;

	public CalcOutput(double param1, double param2, double result) {

		this.param1 = param1;
		this.param2 = param2;
		this.result = result;
	}

	public CalcOutput(double param1, CalcOutput result2) {

		this.param1 = param1;
		this.result2 = result2;
	}

	public double getParam1() {
		return param1;
	}

	public double getParam2() {
		return param2;
	}

	public double getResult() {
		return result;
	}
	
	public CalcOutput getResult2() {
		return result2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((result2 == null) ? 0 : result2.hashCode());
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
		CalcOutput other = (CalcOutput) obj;
		if (result2 == null) {
			if (other.result2 != null)
				return false;
		} else if (!result2.equals(other.result2))
			return false;
		return true;
	}

	
}
