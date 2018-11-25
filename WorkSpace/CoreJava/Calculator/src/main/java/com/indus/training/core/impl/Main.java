package com.indus.training.core.impl;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Main {

	static Logger logger = Logger.getLogger(Calculator.class);
	
	
	public static void main(String[] args) {

		DOMConfigurator.configure("log4j.xml");
		
		Calculator calObj = new Calculator();

		System.out.println("hai");
		

		
		try {

			calObj.division(10.0, 0.0);
			int i = 10/0;

		} catch (ArithmeticException ex) {
			logger.error("Arithmetic ex!", ex);
		}
	}

}
