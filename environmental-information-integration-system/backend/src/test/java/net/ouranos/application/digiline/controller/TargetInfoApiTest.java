package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import net.ouranos.domain.digiline.model.TargetInfo;

/**
 * Unit tests for the {@link TargetInfoApi} class.
 */
public class TargetInfoApiTest {

    private TargetInfoApi targetInfoApi = new TargetInfoApi() {

        @Override
        public ResponseEntity<Object> targetInfoGet(UUID xTracking, Long serviceLocationID, Long roadsideUnitID, Integer deviceID, String startAt, String endAt) {
            throw new UnsupportedOperationException("Unimplemented method 'TargetInfoGet'");
        }

        @Override
        public ResponseEntity<Object> targetInfoPut(UUID xTracking, TargetInfo TargetInfo) {
            throw new UnsupportedOperationException("Unimplemented method 'TargetInfoPut'");
        }
        
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = targetInfoApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}

