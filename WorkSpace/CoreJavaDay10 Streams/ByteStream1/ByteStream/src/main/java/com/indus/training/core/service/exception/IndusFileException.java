package com.indus.training.core.service.exception;

public class IndusFileException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7505944850161721379L;

	public IndusFileException() {
	}

	public IndusFileException(String message) {
		super(message);
	}

	public IndusFileException(Throwable cause) {
		super(cause);
	}

	public IndusFileException(String message, Throwable cause) {
		super(message, cause);
	}

	public IndusFileException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
