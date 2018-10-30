package com.indus.training.domain;

public class HeightInput {

	public double height;	//stored in stack as its a variable

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;	//stored in stack when assigned.
	}
	//garbage collected after method endss
}
