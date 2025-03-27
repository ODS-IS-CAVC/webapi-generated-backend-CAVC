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
import net.ouranos.domain.digiline.model.ShipperTransCapacityDel;

/**
 * Unit tests for the {@link ShipperTransCapacityDelApi} class.
 */
public class ShipperTransCapacityDelApiTest {
    private ShipperTransCapacityDelApi shipperTransCapacityDelApi = new ShipperTransCapacityDelApi() {
        @Override
        public ResponseEntity<Void> shipperTransCapacityDelPut(UUID xTracking, @Valid ShipperTransCapacityDel shipperTransCapacityDelApi) {
            throw new UnsupportedOperationException("Unimplemented method 'shipperTransCapacityDelApi'");
        }
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = shipperTransCapacityDelApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
