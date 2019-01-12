package com.indus.training.orm.exception;

public class IndusPresitException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2313979239148166L;

	public IndusPresitException() {
		super();
	}

	public IndusPresitException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public IndusPresitException(String message, Throwable cause) {
		super(message, cause);
	}

	public IndusPresitException(String message) {
		super(message);
	}

	public IndusPresitException(Throwable cause) {
		super(cause);
	}

}
