package com.indus.training.parse;

import com.indus.training.domain.address.Address;

public class Main {
	
	
	public static void main(String[] args) {
		
		MyDomainParser myObj = new MyDomainParser();
		Address addObj=new Address();
		
		addObj.setCity("Albany");
		addObj.setAptNo("2");
		addObj.setHouseNo("352");
		addObj.setState("NY");
		addObj.setStreetName("Manning Blvd");
		addObj.setZip("12206");
		
		myObj.marshal(addObj);
		
	}

}
