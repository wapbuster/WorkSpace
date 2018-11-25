package com.indus.training.parse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.indus.training.domain.address.Address;

public class MyDomainParser {

	public void marshal(Address inputObj) {
		JAXBContext jaxbCxtObj = null;
		try {
			jaxbCxtObj = JAXBContext.newInstance("com.indus.training.domain.address");
			Marshaller marshObj = jaxbCxtObj.createMarshaller();
			marshObj.marshal(inputObj, System.out);
			marshObj.marshal(inputObj, new FileOutputStream(inputObj.getStreetName() + inputObj.getAptNo() + ".xml"));
		System.out.println("done");
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Address unMarshal(String fileName) {
		JAXBContext jaxbCxtObj = null;
		Address addObj = null;
		try {
			jaxbCxtObj = JAXBContext.newInstance("com.indus.training.domain.address");
			Unmarshaller unMarshObj = jaxbCxtObj.createUnmarshaller();

			addObj = (Address) unMarshObj.unmarshal(new FileInputStream(fileName));
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return addObj;
	}

}
