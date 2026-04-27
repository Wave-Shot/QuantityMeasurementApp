package com.quantity;

import com.quantity.controller.QuantityMeasurementController;
import com.quantity.dto.QuantityDTO;
import com.quantity.repository.QuantityMeasurementCacheRepository;
import com.quantity.service.QuantityMeasurementServiceImpl;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityMeasurementCacheRepository repo = QuantityMeasurementCacheRepository.getInstance();
        QuantityMeasurementServiceImpl service = new QuantityMeasurementServiceImpl(repo);
        QuantityMeasurementController controller = new QuantityMeasurementController(service);

        controller.performAddition(
                new QuantityDTO(10, "meter"),
                new QuantityDTO(20, "meter")
        );
    }
}