package com.indus.training.main;

import com.indus.training.ex.IndusException;
import com.indus.training.service.SendReceive;

public class Main {

	public static void main(String[] args) throws IndusException{

		SendReceive sendRecObj = new SendReceive();

		// System.out.println(Infra.test);

		try {
			sendRecObj.send();
			sendRecObj.receive();
		} catch (IndusException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
