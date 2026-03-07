package com.quantity;

public class QuantityMeasurementApp {

    public static void demonstrateAddition(QuantityLength a, QuantityLength b, LengthUnit target) {
        QuantityLength result = QuantityLength.add(a, b, target);
        System.out.println("add(" + a + ", " + b + ", " + target + ") -> " + result);
    }

    public static void main(String[] args) {

        demonstrateAddition(
                new QuantityLength(1.0, LengthUnit.FEET),
                new QuantityLength(12.0, LengthUnit.INCHES),
                LengthUnit.FEET
        );

        demonstrateAddition(
                new QuantityLength(1.0, LengthUnit.FEET),
                new QuantityLength(12.0, LengthUnit.INCHES),
                LengthUnit.INCHES
        );

        demonstrateAddition(
                new QuantityLength(1.0, LengthUnit.FEET),
                new QuantityLength(12.0, LengthUnit.INCHES),
                LengthUnit.YARDS
        );

        demonstrateAddition(
                new QuantityLength(1.0, LengthUnit.YARDS),
                new QuantityLength(3.0, LengthUnit.FEET),
                LengthUnit.YARDS
        );

        demonstrateAddition(
                new QuantityLength(36.0, LengthUnit.INCHES),
                new QuantityLength(1.0, LengthUnit.YARDS),
                LengthUnit.FEET
        );
    }
}