package com.app.quantitymeasurement.repository;

import com.app.quantitymeasurement.entity.QuantityMeasurementEntity;
import com.app.quantitymeasurement.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class QuantityMeasurementDatabaseRepository implements IQuantityMeasurementRepository {

    public void save(QuantityMeasurementEntity entity) {
        try (Connection conn = DBConnection.getConnection()) {

            String sql = "INSERT INTO measurement(operation, result) VALUES (?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, entity.getOperation());
            stmt.setDouble(2, entity.getResult());

            stmt.executeUpdate();

        } catch (Exception e) {
            throw new RuntimeException("DB Error", e);
        }
    }
}