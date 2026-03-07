package com.quantity;

public class QuantityMeasurementApp {

    public static <U extends IMeasurable> void demonstrateEquality(Quantity<U> a, Quantity<U> b) {
        System.out.println(a + " equals " + b + " -> " + a.equals(b));
    }

    public static <U extends IMeasurable> void demonstrateConversion(Quantity<U> q, U target) {
        System.out.println(q + " -> " + q.convertTo(target));
    }

    public static <U extends IMeasurable> void demonstrateAddition(Quantity<U> a, Quantity<U> b, U target) {
        System.out.println(a + " + " + b + " -> " + a.add(b, target));
    }

    public static void main(String[] args) {

        Quantity<LengthUnit> l1 = new Quantity<>(1.0, LengthUnit.FEET);
        Quantity<LengthUnit> l2 = new Quantity<>(12.0, LengthUnit.INCHES);

        demonstrateEquality(l1, l2);
        demonstrateConversion(l1, LengthUnit.INCHES);
        demonstrateAddition(l1, l2, LengthUnit.FEET);

        Quantity<WeightUnit> w1 = new Quantity<>(1.0, WeightUnit.KILOGRAM);
        Quantity<WeightUnit> w2 = new Quantity<>(1000.0, WeightUnit.GRAM);

        demonstrateEquality(w1, w2);
        demonstrateConversion(w1, WeightUnit.GRAM);
        demonstrateAddition(w1, w2, WeightUnit.KILOGRAM);
    }
}