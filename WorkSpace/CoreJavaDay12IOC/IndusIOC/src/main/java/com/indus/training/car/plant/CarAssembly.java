package com.indus.training.car.plant;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.indus.training.body.IBody;
import com.indus.training.body.impl.HondaCivicBoby;
import com.indus.training.car.ICar;
import com.indus.training.car.impl.HondaCivic;
import com.indus.training.engine.IEngine;
import com.indus.training.engine.impl.HondaCivicEngine;
import com.indus.training.ioc.IndusIOCContainer;
import com.indus.training.seat.ISeat;
import com.indus.training.seat.impl.LeatherSeat;
import com.indus.training.tyre.ITyre;
import com.indus.training.tyre.impl.MRFTyre;

public class CarAssembly {

/*
	 * public static ICar assembleCar() {
	 * 
	 * ITyre tire1 = new MRFTyre();
	 * ITyre tire2 = new MRFTyre();
	 * ITyre tire3 = new MRFTyre();
	 * ITyre tire4 = new MRFTyre();
	 * ITyre[] tyres = { tire1, tire2,tire3, tire4 };
	 * 
	 * ISeat seat1 = new LeatherSeat();
	 * ISeat seat2 = new LeatherSeat();
	 * ISeat seat3 = new LeatherSeat();
	 * ISeat seat4 = new LeatherSeat();
	 * ISeat[] seats = {seat1, seat2, seat3, seat4 };
	 * 
	 * IBody carBody = new HondaCivicBoby();
	 * 
	 * IEngine carEngine = new HondaCivicEngine();
	 * 
	 * ICar car = new HondaCivic();
	 * // IOC Car acquired dependent objects using DI
	 * car.setBody(carBody);
	 * car.setEngine(carEngine);
	 * car.setTyres(tyres);
	 * car.setSeats(seats);
	 * 
	 * return car; }
*/
	public static ICar assembleCarWithOutNew() {
		ICar car = null;

		try {
			// Control of create object has been inverted.
			Class tyreClassObj = Class.forName("com.indus.training.tyre.impl.MRFTyre");

			ITyre tire1 = (ITyre) tyreClassObj.newInstance();
			ITyre tire2 = (ITyre) tyreClassObj.newInstance();
			ITyre tire3 = (ITyre) tyreClassObj.newInstance();
			ITyre tire4 = (ITyre) tyreClassObj.newInstance();
			ITyre[] tyres = { tire1, tire2, tire3, tire4 };

			Class seatClassObj = Class.forName("com.indus.training.seat.impl.LeatherSeat");

			ISeat seat1 = (ISeat) seatClassObj.newInstance();
			ISeat seat2 = (ISeat) seatClassObj.newInstance();
			ISeat seat3 = (ISeat) seatClassObj.newInstance();
			ISeat seat4 = (ISeat) seatClassObj.newInstance();
			ISeat[] seats = { seat1, seat2, seat3, seat4 };

			Class bodyClassObj = Class.forName("com.indus.training.body.impl.HondaCivicBoby");

			IBody carBody = (IBody) bodyClassObj.newInstance();

			Class engineClassObj = Class.forName("com.indus.training.engine.impl.HondaCivicEngine");

			IEngine carEngine = (IEngine) engineClassObj.newInstance();

			Class carClassObj = Class.forName("com.indus.training.car.impl.HondaCivic");

			car = (ICar) carClassObj.newInstance();
			// IOC Car acquired dependent objects using DI
			car.setBody(carBody);
			car.setEngine(carEngine);
			car.setTyres(tyres);
			car.setSeats(seats);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return car;
	}

	public static ICar assembleCarWithOutNewWithProperties() {
		ICar car = null;

		try {

			Properties carProperties = new Properties();
			carProperties.load(new FileInputStream(
					new File("C:\\IndusTraining\\WorkSpace.Home\\IndusIOC\\src\\test\\resources\\car.properties")));

			// Control of create object has been inverted.
			Class tyreClassObj = Class.forName(carProperties.getProperty("tyreClass"));

			ITyre tire1 = (ITyre) tyreClassObj.newInstance();
			ITyre tire2 = (ITyre) tyreClassObj.newInstance();
			ITyre tire3 = (ITyre) tyreClassObj.newInstance();
			ITyre tire4 = (ITyre) tyreClassObj.newInstance();
			ITyre[] tyres = { tire1, tire2, tire3, tire4 };

			Class seatClassObj = Class.forName(carProperties.getProperty("seatClass"));

			ISeat seat1 = (ISeat) seatClassObj.newInstance();
			ISeat seat2 = (ISeat) seatClassObj.newInstance();
			ISeat seat3 = (ISeat) seatClassObj.newInstance();
			ISeat seat4 = (ISeat) seatClassObj.newInstance();
			ISeat[] seats = { seat1, seat2, seat3, seat4 };

			Class bodyClassObj = Class.forName(carProperties.getProperty("bodyClass"));

			IBody carBody = (IBody) bodyClassObj.newInstance();

			Class engineClassObj = Class.forName(carProperties.getProperty("engineClass"));

			IEngine carEngine = (IEngine) engineClassObj.newInstance();

			Class carClassObj = Class.forName(carProperties.getProperty("carClass"));

			car = (ICar) carClassObj.newInstance();
			// IOC Car acquired dependent objects using DI
			car.setBody(carBody);
			car.setEngine(carEngine);
			car.setTyres(tyres);
			car.setSeats(seats);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return car;
	}

	public static ICar assembleCarWithIOCContainer() {
		ICar car = null;

		try {

			IndusIOCContainer indIocConObj = new IndusIOCContainer(
					"C:\\IndusTraining\\WorkSpace.Home\\IndusIOC\\src\\test\\resources\\car.properties");

			// Control of create object has been inverted.


			ITyre tire1 = (ITyre) indIocConObj.getObject("tyreClass");
			ITyre tire2 = (ITyre) indIocConObj.getObject("tyreClass");
			ITyre tire3 = (ITyre) indIocConObj.getObject("tyreClass");
			ITyre tire4 = (ITyre) indIocConObj.getObject("tyreClass");
			ITyre[] tyres = { tire1, tire2, tire3, tire4 };

			ISeat seat1 = (ISeat) indIocConObj.getObject("seatClass");
			ISeat seat2 = (ISeat) indIocConObj.getObject("seatClass");
			ISeat seat3 = (ISeat) indIocConObj.getObject("seatClass");
			ISeat seat4 = (ISeat) indIocConObj.getObject("seatClass");
			ISeat[] seats = { seat1, seat2, seat3, seat4 };

			IBody carBody = (IBody) indIocConObj.getObject("bodyClass");

			IEngine carEngine = (IEngine) indIocConObj.getObject("engineClass");

			car = (ICar) indIocConObj.getObject("carClass");
			
			// IOC Car acquired dependent objects using DI
			car.setBody(carBody);
			car.setEngine(carEngine);
			car.setTyres(tyres);
			car.setSeats(seats);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return car;
	}

}
