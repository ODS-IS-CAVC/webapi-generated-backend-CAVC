package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Unit tests for the {@link SemiDynamicInfoApi} class.
 */
public class SemiDynamicInfoApiTest {

    private SemiDynamicInfoApi semiDynamicInfoApi = new SemiDynamicInfoApi() {

        @Override
        public ResponseEntity<Object> semiDynamicInfoGet(UUID xTracking, String encodedData) {
            throw new UnsupportedOperationException("Unimplemented method 'semiDynamicInfoGet'");
        }
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = semiDynamicInfoApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
