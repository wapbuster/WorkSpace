package com.indus.training.car.plant;

import com.indus.training.car.ICar;

public class CarTest {

	public static void main(String[] args) {

		//ICar car = CarAssembly.assembleCarWithIOCContainer();
		ICar car = CarAssembly.assembleCarWithOutNew();
		try {
			car.startCar();
			car.accelerate();
			car.breakCar();
			car.runCar();
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}

}
