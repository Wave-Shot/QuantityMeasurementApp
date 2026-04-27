package com.app.quantitymeasurement.service;

import com.app.quantitymeasurement.entity.QuantityMeasurement;
import com.app.quantitymeasurement.repository.QuantityMeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuantityMeasurementService {

    @Autowired
    private QuantityMeasurementRepository repo;

    public double add(double a, double b) {
        double result = a + b;
        repo.save(new QuantityMeasurement(null, "ADD", result));
        return result;
    }
}