package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import net.ouranos.domain.digiline.model.SensorInfo;

/**
 * Unit tests for the {@link SensorInfoApi} class.
 */
public class SensorInfoApiTest {

    private SensorInfoApi SensorInfoApi = new SensorInfoApi() {

        @Override
        public ResponseEntity<Object> sensorInfoGet(UUID xTracking, Long serviceLocationID,Long roadsideUnitID) {
            throw new UnsupportedOperationException("Unimplemented method 'sensorInfoGet'");
        }

        @Override
        public ResponseEntity<Object> sensorInfoPut(UUID xTracking, SensorInfo sensorInfo) {
            throw new UnsupportedOperationException("Unimplemented method 'sensorInfoPut'");
        }
        
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = SensorInfoApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}

