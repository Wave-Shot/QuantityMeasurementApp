package com.quantity.model;

public class QuantityMeasurementEntity {

    private String operation;
    private double result;
    private boolean error;
    private String message;

    public QuantityMeasurementEntity(String operation, double result) {
        this.operation = operation;
        this.result = result;
    }

    public QuantityMeasurementEntity(String message) {
        this.error = true;
        this.message = message;
    }

    public String toString() {
        if (error) return "Error: " + message;
        return operation + " Result: " + result;
    }
}