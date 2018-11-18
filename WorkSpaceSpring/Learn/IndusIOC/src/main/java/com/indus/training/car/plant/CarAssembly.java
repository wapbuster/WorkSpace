package com.indus.training.car.plant;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indus.training.body.IBody;
import com.indus.training.body.impl.CarBody;
import com.indus.training.car.ICar;
import com.indus.training.car.impl.Audi;
import com.indus.training.engine.IEngine;
import com.indus.training.engine.impl.CarEngine;
import com.indus.training.ioc.IndusIOCContainer;
import com.indus.training.seat.ISeat;
import com.indus.training.seat.impl.Seat;
import com.indus.training.tyre.ITyre;
import com.indus.training.tyre.impl.MRFTyre;

public class CarAssembly {

	public static ICar assembleCarWithIOCContainer() {
		ICar car = null;
		ICar car2 = null;

		try {

			ApplicationContext appContextObj = new ClassPathXmlApplicationContext("beans.xml");

			ITyre tire1 = (ITyre) appContextObj.getBean("tyreObj");
			ITyre tire2 = (ITyre) appContextObj.getBean("tyreObj");
			ITyre tire3 = (ITyre) appContextObj.getBean("tyreObj");
			ITyre tire4 = (ITyre) appContextObj.getBean("tyreObj");
			ITyre[] tyres = { tire1, tire2, tire3, tire4 };
			
			ITyre tirea1 = (ITyre) appContextObj.getBean("tyreObj1");
			ITyre tirea2 = (ITyre) appContextObj.getBean("tyreObj1");
			ITyre tirea3 = (ITyre) appContextObj.getBean("tyreObj1");
			ITyre tirea4 = (ITyre) appContextObj.getBean("tyreObj1");
			ITyre[] tyresa = { tirea1, tirea2, tirea3, tirea4 };
			

			ISeat seat1 = (ISeat) appContextObj.getBean("seatObj");
			ISeat seat2 = (ISeat) appContextObj.getBean("seatObj");
			ISeat seat3 = (ISeat) appContextObj.getBean("seatObj");
			ISeat seat4 = (ISeat) appContextObj.getBean("seatObj");
			ISeat[] seats = { seat1, seat2, seat3, seat4 };

			IBody carBody = (IBody) appContextObj.getBean("bodyObj");

			IEngine carEngine = (IEngine) appContextObj.getBean("engObj");

			car = (ICar) appContextObj.getBean("carObj");
			car2 = (ICar) appContextObj.getBean("carObj");

			// IOC Car acquired dependent objects using DI
			car.setBody(carBody);
			car.setEngine(carEngine);
			car.setTyres(tyres);
			car2.setTyres(tyresa);
			car.setSeats(seats);
			appContextObj = null;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return car;
	}

}
