package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import net.ouranos.domain.digiline.model.SignalInfo;

/**
 * Unit tests for the {@link SignalInfoApi} class.
 */
public class SignalInfoApiTest {

    private SignalInfoApi SignalInfoApi = new SignalInfoApi() {

        @Override
        public ResponseEntity<Object> signalInfoGet(UUID xTracking, Long roadsideUnitID, Long serviceLocationID) {
            throw new UnsupportedOperationException("Unimplemented method 'SignalInfoGet'");
        }

        @Override
        public ResponseEntity<Object> signalInfoPut(UUID xTracking, SignalInfo SignalInfo) {
            throw new UnsupportedOperationException("Unimplemented method 'SignalInfoPut'");
        }
        
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = SignalInfoApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}

