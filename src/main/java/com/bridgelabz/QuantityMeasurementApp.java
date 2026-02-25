package com.bridgelabz;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityLength q1 = new QuantityLength(1.0, LengthUnit.YARDS);
        QuantityLength q2 = new QuantityLength(3.0, LengthUnit.FEET);

        System.out.println("1 Yard == 3 Feet ? " + q1.equals(q2));

        QuantityLength q3 = new QuantityLength(1.0, LengthUnit.YARDS);
        QuantityLength q4 = new QuantityLength(36.0, LengthUnit.INCH);

        System.out.println("1 Yard == 36 Inches ? " + q3.equals(q4));

        QuantityLength q5 = new QuantityLength(1.0, LengthUnit.CENTIMETERS);
        QuantityLength q6 = new QuantityLength(0.393701, LengthUnit.INCH);

        System.out.println("1 CM == 0.393701 Inch ? " + q5.equals(q6));

        QuantityLength q7 = new QuantityLength(2.0, LengthUnit.YARDS);
        QuantityLength q8 = new QuantityLength(72.0, LengthUnit.INCH);

        System.out.println("2 Yards == 72 Inches ? " + q7.equals(q8));
    }
}