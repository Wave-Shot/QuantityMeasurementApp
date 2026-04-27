package com.app.quantitymeasurement.controller;

import com.app.quantitymeasurement.service.QuantityMeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/quantities")
public class QuantityMeasurementController {

    @Autowired
    private QuantityMeasurementService service;

    @PostMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b) {
        return service.add(a, b);
    }
}