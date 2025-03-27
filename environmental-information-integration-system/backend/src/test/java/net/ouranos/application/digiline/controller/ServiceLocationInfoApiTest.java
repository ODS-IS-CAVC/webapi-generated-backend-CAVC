package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import net.ouranos.domain.digiline.model.ServiceLocationInfo;

/**
 * Unit tests for the {@link ServiceLocationInfoApi} class.
 */
public class ServiceLocationInfoApiTest {

    private ServiceLocationInfoApi serviceLocationInfoApi = new ServiceLocationInfoApi() {

        @Override
        public ResponseEntity<Object> serviceLocationInfoGet(UUID xTracking, Long serviceLocationID) {
            throw new UnsupportedOperationException("Unimplemented method 'ServiceLocationInfoGet'");
        }

        @Override
        public ResponseEntity<Object> serviceLocationInfoPut(UUID xTracking, ServiceLocationInfo ServiceLocationInfo) {
            throw new UnsupportedOperationException("Unimplemented method 'ServiceLocationInfoPut'");
        }
        
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = serviceLocationInfoApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}

