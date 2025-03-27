package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.Valid;
import net.ouranos.domain.digiline.model.CarrierTransRequestDel;

/**
 * Unit tests for the {@link CarrierTransRequestDelApi} class.
 */
public class CarrierTransRequestDelApiTest {
    private CarrierTransRequestDelApi carrierTransRequestDelApi = new CarrierTransRequestDelApi() {
        @Override
        public ResponseEntity<Void> carrierTransRequestDelPut(UUID xTracking, @Valid CarrierTransRequestDel carrierTransRequestDelApi) {
            throw new UnsupportedOperationException("Unimplemented method 'carrierTransRequestDelApi'");
        }
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = carrierTransRequestDelApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
