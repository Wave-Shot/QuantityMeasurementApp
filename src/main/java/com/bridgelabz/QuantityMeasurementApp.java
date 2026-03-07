package com.quantity;

public class QuantityMeasurementApp {

    public static void demonstrateLengthConversion(double value, LengthUnit fromUnit, LengthUnit toUnit) {
        double result = QuantityLength.convert(value, fromUnit, toUnit);
        System.out.println("convert(" + value + ", " + fromUnit + ", " + toUnit + ") -> " + result);
    }

    public static void demonstrateLengthConversion(QuantityLength length, LengthUnit toUnit) {
        QuantityLength converted = length.convertTo(toUnit);
        System.out.println(length + " -> " + converted);
    }

    public static void demonstrateLengthEquality(QuantityLength a, QuantityLength b) {
        System.out.println(a + " equals " + b + " ? " + a.equals(b));
    }

    public static void demonstrateLengthComparison(double v1, LengthUnit u1, double v2, LengthUnit u2) {
        QuantityLength q1 = new QuantityLength(v1, u1);
        QuantityLength q2 = new QuantityLength(v2, u2);
        demonstrateLengthEquality(q1, q2);
    }

    public static void main(String[] args) {

        demonstrateLengthConversion(1.0, LengthUnit.FEET, LengthUnit.INCHES);
        demonstrateLengthConversion(3.0, LengthUnit.YARDS, LengthUnit.FEET);
        demonstrateLengthConversion(36.0, LengthUnit.INCHES, LengthUnit.YARDS);
        demonstrateLengthConversion(1.0, LengthUnit.CENTIMETERS, LengthUnit.INCHES);
        demonstrateLengthConversion(0.0, LengthUnit.FEET, LengthUnit.INCHES);

        QuantityLength length = new QuantityLength(3.0, LengthUnit.YARDS);
        demonstrateLengthConversion(length, LengthUnit.INCHES);

        demonstrateLengthComparison(1, LengthUnit.FEET, 12, LengthUnit.INCHES);
    }
}