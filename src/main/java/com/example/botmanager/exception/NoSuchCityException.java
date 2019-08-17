package com.example.botmanager.exception;

/**
 * @author Alexander Lomat
 * @version 0.0.4
 * Custom exception class
 */


public class NoSuchCityException extends Exception {
    public NoSuchCityException() {
        super();
    }

    public NoSuchCityException(String message) {
        super(message);
    }

    public NoSuchCityException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}
