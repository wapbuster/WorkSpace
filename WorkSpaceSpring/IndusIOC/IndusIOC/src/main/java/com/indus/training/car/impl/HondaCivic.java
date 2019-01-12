package com.indus.training.car.impl;

import com.indus.training.body.IBody;
import com.indus.training.car.ICar;
import com.indus.training.engine.IEngine;
import com.indus.training.seat.ISeat;
import com.indus.training.tyre.ITyre;

public class HondaCivic implements ICar {

	private ITyre[] tyres = null;
	private ISeat[] seats = null;

	private IBody body = null;
	private IEngine engine = null;

	public HondaCivic() {
		super();
	}

	public HondaCivic(ITyre[] tyres, ISeat[] seats, IBody body, IEngine engine) {
		super();
		this.tyres = tyres;
		this.seats = seats;
		this.body = body;
		this.engine = engine;
	}

	public void setTyres(ITyre[] tyres) {
		this.tyres = tyres;
	}

	public void setSeats(ISeat[] seats) {
		this.seats = seats;
	}

	public void setBody(IBody body) {
		this.body = body;
	}

	public void setEngine(IEngine engine) {
		this.engine = engine;
	}

	public void startCar() throws Exception {
		for (int i = 0; i < seats.length; i++) {
			seats[i].seatDetails();
		}
		body.carBodyDetails();
		engine.startEngine();
	}

	public void runCar() throws Exception {
		for (int i = 0; i < tyres.length; i++) {
			tyres[i].rotate();

		}
	}

	public void breakCar() throws Exception {
		System.out.println("Breaks applied");

	}

	public void accelerate() throws Exception {
		System.out.println("Civic Car moving fast");
	}

}
