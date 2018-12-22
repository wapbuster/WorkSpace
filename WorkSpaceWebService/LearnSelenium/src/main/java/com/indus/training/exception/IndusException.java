package com.indus.training.exception;

public class IndusException extends Exception {
    public IndusException() {
        super();
    }

    public IndusException(String message) {
        super(message);
    }

    public IndusException(String message, Throwable cause) {
        super(message, cause);
    }

    public IndusException(Throwable cause) {
        super(cause);
    }

    protected IndusException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
