package com.indus.training.car;

import com.indus.training.body.IBody;
import com.indus.training.engine.IEngine;
import com.indus.training.seat.ISeat;
import com.indus.training.tyre.ITyre;

public interface ICar {

	public void startCar() throws Exception;

	public void runCar() throws Exception;

	public void breakCar() throws Exception;

	public void accelerate() throws Exception;

	public void setTyres(ITyre[] tyres);

	public void setSeats(ISeat[] seats);

	public void setBody(IBody body);

	public void setEngine(IEngine engine);
}
