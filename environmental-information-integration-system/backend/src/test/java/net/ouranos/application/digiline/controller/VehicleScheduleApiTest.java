package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import jakarta.validation.Valid;
import net.ouranos.domain.digiline.model.VehicleSchedule;

/**
 * Unit tests for the {@link VehicleScheduleApi} class.
 */
public class VehicleScheduleApiTest {

    private VehicleScheduleApi VehicleScheduleApi = new VehicleScheduleApi() {

        @Override
        public ResponseEntity<Void> vehicleSchedulePost(UUID xTracking, @Valid VehicleSchedule vehicleSchedule) {
            throw new UnsupportedOperationException("Unimplemented method 'VehicleSchedulePut'");
        }
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = VehicleScheduleApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
