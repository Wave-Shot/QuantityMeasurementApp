package com.quantity;

import java.util.Objects;

public class QuantityLength {

    private final double value;
    private final LengthUnit unit;

    public QuantityLength(double value, LengthUnit unit) {
        if (!Double.isFinite(value))
            throw new IllegalArgumentException("Invalid value");

        if (unit == null)
            throw new IllegalArgumentException("Unit cannot be null");

        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public LengthUnit getUnit() {
        return unit;
    }

    public static double convert(double value, LengthUnit source, LengthUnit target) {

        if (!Double.isFinite(value))
            throw new IllegalArgumentException("Invalid value");

        if (source == null || target == null)
            throw new IllegalArgumentException("Unit cannot be null");

        double valueInFeet = value * source.getConversionFactor();
        double result = valueInFeet / target.getConversionFactor();

        return result;
    }

    public QuantityLength convertTo(LengthUnit target) {
        double convertedValue = convert(this.value, this.unit, target);
        return new QuantityLength(convertedValue, target);
    }

    public static QuantityLength add(QuantityLength a, QuantityLength b) {

        if (a == null || b == null)
            throw new IllegalArgumentException("Length cannot be null");

        double aBase = a.value * a.unit.getConversionFactor();
        double bBase = b.value * b.unit.getConversionFactor();

        double sumBase = aBase + bBase;

        double result = sumBase / a.unit.getConversionFactor();

        return new QuantityLength(result, a.unit);
    }

    public static QuantityLength add(double v1, LengthUnit u1, double v2, LengthUnit u2, LengthUnit target) {

        if (!Double.isFinite(v1) || !Double.isFinite(v2))
            throw new IllegalArgumentException("Invalid value");

        if (u1 == null || u2 == null || target == null)
            throw new IllegalArgumentException("Unit cannot be null");

        double base1 = v1 * u1.getConversionFactor();
        double base2 = v2 * u2.getConversionFactor();

        double sumBase = base1 + base2;

        double result = sumBase / target.getConversionFactor();

        return new QuantityLength(result, target);
    }

    private double toBaseUnit() {
        return value * unit.getConversionFactor();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof QuantityLength)) return false;

        QuantityLength other = (QuantityLength) obj;

        double epsilon = 0.01;

        return Math.abs(this.toBaseUnit() - other.toBaseUnit()) < epsilon;
    }

    @Override
    public int hashCode() {
        return Objects.hash(toBaseUnit());
    }

    @Override
    public String toString() {
        return "Quantity(" + value + ", " + unit + ")";
    }
}