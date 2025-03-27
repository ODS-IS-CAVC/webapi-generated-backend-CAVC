package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Optional;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.Valid;
import net.ouranos.domain.digiline.model.Vehicle;

/**
 * Unit tests for the {@link VehicleApi} class.
 */
public class VehicleApiTest {
    private VehicleApi vehicleApi = new VehicleApi() {

        @Override
        public ResponseEntity<Void> vehicleDelete(UUID xTracking, @Valid String vehicle) {
            throw new UnsupportedOperationException("Unimplemented method 'VehicleDelete'");
        }

        @Override
        public ResponseEntity<Object> vehicleGet(UUID xTracking, String vehicleType) {
            throw new UnsupportedOperationException("Unimplemented method 'VehicleGet'");
        }

        @Override
        public ResponseEntity<Void> vehiclePut(UUID xTracking, @Valid Vehicle vehicle) {
            throw new UnsupportedOperationException("Unimplemented method 'VehiclePut'");
        }
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = vehicleApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
