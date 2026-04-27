package com.app.quantitymeasurement.service;

import com.app.quantitymeasurement.dto.QuantityDTO;

public interface IQuantityMeasurementService {
    void add(QuantityDTO q1, QuantityDTO q2);
}