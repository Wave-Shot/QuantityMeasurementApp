package com.bridgelabz;

public class QuantityMeasurementApp {

    static class Feet {
        private final double value;

        public Feet(double value) {
            if (Double.isNaN(value) || Double.isInfinite(value)) {
                throw new IllegalArgumentException("Invalid numeric value for Feet");
            }
            this.value = value;
        }

        public boolean equals(Feet other) {
            if (other == null) return false;
            return Double.compare(this.value, other.value) == 0;
        }
    }

    static class Inches {
        private final double value;

        public Inches(double value) {
            if (Double.isNaN(value) || Double.isInfinite(value)) {
                throw new IllegalArgumentException("Invalid numeric value for Inches");
            }
            this.value = value;
        }

        public boolean equals(Inches other) {
            if (other == null) return false;
            return Double.compare(this.value, other.value) == 0;
        }
    }

    public static boolean checkFeetEquality(double value1, double value2) {
        Feet feet1 = new Feet(value1);
        Feet feet2 = new Feet(value2);
        return feet1.equals(feet2);
    }

    public static boolean checkInchesEquality(double value1, double value2) {
        Inches inch1 = new Inches(value1);
        Inches inch2 = new Inches(value2);
        return inch1.equals(inch2);
    }

    public static void main(String[] args) {

        boolean feetResult = checkFeetEquality(1.0, 1.0);
        System.out.println("1.0 ft and 1.0 ft Equal? " + feetResult);

        boolean inchResult = checkInchesEquality(1.0, 1.0);
        System.out.println("1.0 inch and 1.0 inch Equal? " + inchResult);
    }
}