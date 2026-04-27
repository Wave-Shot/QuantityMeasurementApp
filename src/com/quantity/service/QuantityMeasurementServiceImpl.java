package com.quantity.service;

import com.quantity.dto.QuantityDTO;
import com.quantity.model.QuantityMeasurementEntity;
import com.quantity.repository.IQuantityMeasurementRepository;

public class QuantityMeasurementServiceImpl implements IQuantityMeasurementService {

    private IQuantityMeasurementRepository repo;

    public QuantityMeasurementServiceImpl(IQuantityMeasurementRepository repo) {
        this.repo = repo;
    }

    public QuantityMeasurementEntity add(QuantityDTO q1, QuantityDTO q2) {

        if (!q1.getUnit().equals(q2.getUnit())) {
            QuantityMeasurementEntity e = new QuantityMeasurementEntity("Units mismatch");
            repo.save(e);
            return e;
        }

        double result = q1.getValue() + q2.getValue();
        QuantityMeasurementEntity e = new QuantityMeasurementEntity("Addition", result);
        repo.save(e);

        return e;
    }
}