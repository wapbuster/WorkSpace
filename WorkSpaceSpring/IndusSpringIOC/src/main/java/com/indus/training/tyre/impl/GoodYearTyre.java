package com.indus.training.tyre.impl;

import com.indus.training.tyre.ITyre;

public class GoodYearTyre implements ITyre {

	public void rotate() throws Exception {
		System.out.println("GoodYearTyre tyre Rotates");
	}

	public void tyreDetails() throws Exception {
		System.out.println("GoodYearTyre tyre 50/50 250 345 details");

	}

}
