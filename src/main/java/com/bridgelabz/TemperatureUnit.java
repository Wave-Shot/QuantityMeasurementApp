package com.quantity;

public enum TemperatureUnit implements IMeasurable {

    CELSIUS {
        public double convertToBaseUnit(double value) {
            return value;
        }

        public double convertFromBaseUnit(double baseValue) {
            return baseValue;
        }
    },

    FAHRENHEIT {
        public double convertToBaseUnit(double value) {
            return (value - 32) * 5 / 9;
        }

        public double convertFromBaseUnit(double baseValue) {
            return (baseValue * 9 / 5) + 32;
        }
    },

    KELVIN {
        public double convertToBaseUnit(double value) {
            return value - 273.15;
        }

        public double convertFromBaseUnit(double baseValue) {
            return baseValue + 273.15;
        }
    };

    public double getConversionFactor() {
        return 1.0;
    }

    public boolean supportsArithmetic() {
        return false;
    }

    public void validateOperationSupport(String operation) {
        throw new UnsupportedOperationException(
                "Temperature does not support " + operation + " operation"
        );
    }

    public String getUnitName() {
        return name();
    }
}