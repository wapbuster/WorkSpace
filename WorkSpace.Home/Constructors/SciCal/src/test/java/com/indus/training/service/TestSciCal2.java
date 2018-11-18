package com.indus.training.service;

import java.nio.channels.ScatteringByteChannel;

import com.indus.training.service.impl.SciCal;
import junit.framework.TestCase;

public class TestSciCal2 extends TestCase {

	private Class sciClassObj = null;
	
	
	public void testReflection() {
		
		try {
			sciClassObj =  Class.forName("com.indus.training.service.impl.SciCal");
			
			ClassLoader classLoaderObj = sciClassObj.getClassLoader();
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void testScenario1() throws InstantiationException, IllegalAccessException {
		try {
			sciClassObj =  Class.forName("com.indus.training.service.impl.SciCal");
			
			//ClassLoader classLoaderObj = sciClassObj.getClassLoader();
			
			SciCal sciObj = (SciCal) sciClassObj.newInstance();
			
			sciObj.sciCal(sciCalInObj)			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
