package com.app.quantitymeasurement.service;

import com.app.quantitymeasurement.dto.QuantityDTO;
import com.app.quantitymeasurement.entity.QuantityMeasurementEntity;
import com.app.quantitymeasurement.repository.IQuantityMeasurementRepository;

public class QuantityMeasurementServiceImpl implements IQuantityMeasurementService {

    private IQuantityMeasurementRepository repo;

    public QuantityMeasurementServiceImpl(IQuantityMeasurementRepository repo) {
        this.repo = repo;
    }

    public void add(QuantityDTO q1, QuantityDTO q2) {

        if (!q1.getUnit().equals(q2.getUnit())) {
            System.out.println("Units mismatch");
            return;
        }

        double result = q1.getValue() + q2.getValue();
        repo.save(new QuantityMeasurementEntity("Addition", result));

        System.out.println("Result: " + result);
    }
}