package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Unit tests for the {@link RoutesApi} class.
 */
public class RoutesApiTest {

    private RoutesApi routesApi = new RoutesApi() {

        @Override
        public ResponseEntity<Object> routesGet(UUID xTracking, UUID queryParam) {
            throw new UnsupportedOperationException("Unimplemented method 'routesGet'");
        }

    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = routesApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
