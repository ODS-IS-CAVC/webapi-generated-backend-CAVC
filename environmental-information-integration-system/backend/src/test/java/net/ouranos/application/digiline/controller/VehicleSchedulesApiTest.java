package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Unit tests for the {@link VehicleSchedulesApi} class.
 */
public class VehicleSchedulesApiTest {

    private VehicleSchedulesApi vehicleSchedulesApi = new VehicleSchedulesApi() {

        @Override
        public ResponseEntity<Object> vehicleSchedulesGet(UUID xTracking, UUID queryParam) {
            throw new UnsupportedOperationException("Unimplemented method 'vehicleSchedulesGet'");
        }

    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = vehicleSchedulesApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
