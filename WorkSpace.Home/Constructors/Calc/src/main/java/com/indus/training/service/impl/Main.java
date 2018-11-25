package com.indus.training.service.impl;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.indus.training.domain.CalciInput;
import com.indus.training.domain.CalciOutput;

public class Main {
	static Logger logger = Logger.getLogger(Calculator.class);


	public static void main(String[] args) {

		DOMConfigurator.configure("log4j.xml");
		
		System.out.println("start..!");
		CalciInput calInObj = new CalciInput(10.0, 0.0);
		
		System.out.println(calInObj.getParam1());
		
		
		//int i= 10/0;

		Calculator calObj = new Calculator();
		calObj.division(calInObj);
		
		
		
		
		CalciOutput calOutObj = new CalciOutput();
		System.out.println(calOutObj.getResult());
		
		
		
		
		System.out.println("2");
		try {
			int i= 10/0;
		} catch (ArithmeticException ex) {
			logger.error("Sorry, something wrong!", ex);
		}
		
		
		

	}

}
