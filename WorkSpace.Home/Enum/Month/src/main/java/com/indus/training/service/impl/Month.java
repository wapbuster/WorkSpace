package com.indus.training.service.impl;

public enum Month {
	Jan(1), Feb(2), March(3), April(4), May(5), June(6), July(7), Aug(8), Sept(9), Oct(10), Nov(11), Dec(12);

	private int monthNo;

	private Month(int monthNo) {
		this.monthNo = monthNo;
	}

	public int getMonthNo() {
		return monthNo;
	}
}
