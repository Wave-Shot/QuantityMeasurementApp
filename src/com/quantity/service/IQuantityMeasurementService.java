package com.quantity.service;

import com.quantity.dto.QuantityDTO;
import com.quantity.model.QuantityMeasurementEntity;

public interface IQuantityMeasurementService {
    QuantityMeasurementEntity add(QuantityDTO q1, QuantityDTO q2);
}