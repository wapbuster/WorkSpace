package com.indus.training.service.impl;

public enum Capital {

	India("New Delhi"), SriLanka("Colombo"), Pakistan("Islamabad"), Nepal("Kathmandu");

	private String capital;

	private Capital(String capital) {
		this.capital = capital;
	}
	
	public String getCapital() {
		return capital;
	}
}
