package com.indus.training.engine.impl;

import com.indus.training.engine.IEngine;

public class CarEngine implements IEngine {

	public void startEngine() throws Exception {
		System.out.println("Engine started");
	}

	public void stopEngine() throws Exception {
		System.out.println("Engine stopped");
	}

}
