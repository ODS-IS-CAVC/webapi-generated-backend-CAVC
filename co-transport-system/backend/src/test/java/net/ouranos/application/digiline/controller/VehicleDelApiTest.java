package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.Valid;
import net.ouranos.domain.digiline.model.CarrierTransCapacity;
import net.ouranos.domain.digiline.model.Vehicle;
import net.ouranos.domain.digiline.model.VehicleDel;

/**
 * Unit tests for the {@link VehicleDelApi} class.
 */
public class VehicleDelApiTest {
    private VehicleDelApi vehicleDelApi = new VehicleDelApi() {
        @Override
        public ResponseEntity<Void> vehicleDelPut(UUID xTracking, @Valid VehicleDel vehicleDelApi) {
            throw new UnsupportedOperationException("Unimplemented method 'vehicleDelApi'");
        }
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = vehicleDelApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
