package com.indus.training.ioc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class IndusIOCContainer {

	private String fileName = null;

	private String fileLocation = null;

	private Properties objProperties = null;

	public IndusIOCContainer(String fileName) {

		objProperties = new Properties();
		try {
			objProperties.load(new FileInputStream(new File(fileName)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public IndusIOCContainer(String fileName, String fileLocation) {
		super();
		this.fileName = fileName;
		this.fileLocation = fileLocation;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	public Object getObject(String key) {

		Object obj = null;
		try {
			Class classObj = Class.forName(objProperties.getProperty(key));
			obj = classObj.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return obj;
	}

}
