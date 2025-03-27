package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Unit tests for the {@link BusStopsApi} class.
 */
public class BusStopsApiTest {

    private BusStopsApi busStopsApi = new BusStopsApi() {

        @Override
        public ResponseEntity<Object> busStopsGet(UUID xTracking) {
            throw new UnsupportedOperationException("Unimplemented method 'partsGet'");
        }
        
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = busStopsApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
