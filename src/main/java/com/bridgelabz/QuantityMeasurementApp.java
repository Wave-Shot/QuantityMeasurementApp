package com.bridgelabz;

public class QuantityMeasurementApp {

    static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        public boolean equals(Feet other) {
            return this.value == other.value;
        }
    }

    public static void main(String[] args) {
        Feet feet1 = new Feet(5.0);
        Feet feet2 = new Feet(5.0);

        System.out.println("Are feet equal? " + feet1.equals(feet2));
    }
}
