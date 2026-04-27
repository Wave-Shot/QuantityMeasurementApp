package com.app.quantitymeasurement.exception;

public class DatabaseException extends RuntimeException {
    public DatabaseException(String msg, Exception e) {
        super(msg, e);
    }
}