package com.quantity;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityLength q1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength q2 = new QuantityLength(12.0, LengthUnit.INCHES);

        System.out.println(q1.convertTo(LengthUnit.INCHES));

        System.out.println(QuantityLength.add(q1, q2, LengthUnit.FEET));

        QuantityLength q3 = new QuantityLength(36.0, LengthUnit.INCHES);
        QuantityLength q4 = new QuantityLength(1.0, LengthUnit.YARDS);

        System.out.println(q3.equals(q4));

        QuantityLength q5 = new QuantityLength(1.0, LengthUnit.YARDS);
        QuantityLength q6 = new QuantityLength(3.0, LengthUnit.FEET);

        System.out.println(QuantityLength.add(q5, q6, LengthUnit.YARDS));
        QuantityWeight w1 = new QuantityWeight(1.0, WeightUnit.KILOGRAM);
        QuantityWeight w2 = new QuantityWeight(1000.0, WeightUnit.GRAM);

        System.out.println(w1.equals(w2));

        System.out.println(w1.convertTo(WeightUnit.POUND));

        System.out.println(QuantityWeight.add(w1, w2));

        System.out.println(QuantityWeight.add(w1, w2, WeightUnit.GRAM));
    }
}