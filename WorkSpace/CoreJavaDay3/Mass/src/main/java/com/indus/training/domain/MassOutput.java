package com.indus.training.domain;

public class MassOutput {

	public double mass;
	public double result;

	public double getMass() {
		return mass;	//in to the stack
	}

	public void setMass(double mass) {
		this.mass = mass;	//in to the stack
	}

	public double getResult() {
		return result;	//in to the stack
	}

	public void setResult(double result) {
		this.result = result;	//in to the stack
	}	//garbage collected after method ends

}