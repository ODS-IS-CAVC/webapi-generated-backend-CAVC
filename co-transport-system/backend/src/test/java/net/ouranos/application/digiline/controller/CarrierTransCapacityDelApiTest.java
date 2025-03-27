package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.Valid;
import net.ouranos.domain.digiline.model.CarrierTransCapacityDel;
import net.ouranos.domain.digiline.model.CarrierTransCapacity;

/**
 * Unit tests for the {@link CarrierTransCapacityDelApi} class.
 */
public class CarrierTransCapacityDelApiTest {
    private CarrierTransCapacityDelApi carrierTransCapacityDelApi = new CarrierTransCapacityDelApi() {
        @Override
        public ResponseEntity<Void> carrierTransCapacityDelPut(UUID xTracking, @Valid CarrierTransCapacityDel carrierTransCapacityDelApi) {
            throw new UnsupportedOperationException("Unimplemented method 'carrierTransCapacityDelApi'");
        }
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = carrierTransCapacityDelApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
