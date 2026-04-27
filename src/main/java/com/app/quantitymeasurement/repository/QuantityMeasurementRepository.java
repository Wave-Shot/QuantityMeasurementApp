package com.app.quantitymeasurement.repository;

import com.app.quantitymeasurement.entity.QuantityMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuantityMeasurementRepository
        extends JpaRepository<QuantityMeasurement, Long> {
}