package com.indus.training.engine.impl;

import com.indus.training.engine.IEngine;

public class HondaCivicEngine implements IEngine {

	public void startEngine() throws Exception {
		System.out.println("Civic Engine started");
	}

	public void stopEngine() throws Exception {
		System.out.println("Civic Engine stoped");
	}

}
