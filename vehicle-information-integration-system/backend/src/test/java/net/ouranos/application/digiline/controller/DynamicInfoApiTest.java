package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Optional;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;


/**
 * Unit tests for the {@link DynamicInfoApi} class.
 */
public class DynamicInfoApiTest {

    private DynamicInfoApi dynamicInfoApi = new DynamicInfoApi() {

       

        @Override
        public ResponseEntity<Object> dynamicInfoGet(UUID xTracking, String queryParam) {
            throw new UnsupportedOperationException("Unimplemented method 'dynamicInfoGet'");
        }
        
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = dynamicInfoApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}