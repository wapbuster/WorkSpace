package com.indus.training.parse;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.indus.training.product.Owner;
import com.indus.training.product.Product;

public class Main {

	public static void main(String[] args) {
		marshal();
		unmarshal();

	}

	public static void marshal() {
		JAXBContext jaxbContext;
		Owner ownerObj = new Owner(6381278, "Sunny", "snanda@albany.edu");
		Product productObj = new Product("Samsung galaxy", 950, ownerObj);
		try {
			jaxbContext = JAXBContext.newInstance(Product.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(productObj, new File("product.xml"));
			marshaller.marshal(productObj, System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ownerObj = null;
			productObj = null;
			jaxbContext = null;
		}
	}

	public static void unmarshal() {

		Product productObj;

		File file = new File("product.xml");
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Product.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			productObj = (Product) unmarshaller.unmarshal(file);
			System.out.println(productObj);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
