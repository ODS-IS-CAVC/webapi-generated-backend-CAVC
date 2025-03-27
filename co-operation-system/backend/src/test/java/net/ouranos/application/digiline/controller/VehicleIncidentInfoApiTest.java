package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import jakarta.validation.Valid;
import net.ouranos.domain.digiline.model.VehicleIncidentInfo;

/**
 * Unit tests for the {@link VehicleIncidentInfoApi} class.
 */
public class VehicleIncidentInfoApiTest {

    private VehicleIncidentInfoApi vehicleIncidentInfoApi = new VehicleIncidentInfoApi() {

        @Override
        public ResponseEntity<Void> vehicleIncidentInfoPut(UUID xTracking,
                @Valid VehicleIncidentInfo vehicleIncidentInfo) {
            throw new UnsupportedOperationException("Unimplemented method 'VehicleIncidentInfoPut'");
        }
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = vehicleIncidentInfoApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
