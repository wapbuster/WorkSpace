package com.indus.tarining.domain;

public class AreaOutput {
	
	private double side;
	private double result;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;	// a block in the top of the stack is created.
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;	// a block in the top of the stack is created.
	}	//garbage collected after method ends
}
