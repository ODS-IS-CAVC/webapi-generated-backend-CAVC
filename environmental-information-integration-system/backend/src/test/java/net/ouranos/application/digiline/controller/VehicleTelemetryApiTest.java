package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Unit tests for the {@link VehicleTelemetryApi} class.
 */
public class VehicleTelemetryApiTest {

    private VehicleTelemetryApi vehicleTelemetryApi = new VehicleTelemetryApi() {

        @Override
        public ResponseEntity<Object> vehicleTelemetryGet(UUID xTracking, UUID queryParam) {
            throw new UnsupportedOperationException("Unimplemented method 'vehicleTelemetryGet'");
        }

    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = vehicleTelemetryApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
