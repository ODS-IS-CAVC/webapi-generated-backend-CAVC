package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import jakarta.validation.Valid;
import net.ouranos.domain.digiline.model.TrackBySip;

/**
 * Unit tests for the {@link TrackBySipApi} class.
 */
public class TrackBySIPApiTest {

    private TrackBySIPApi trackBySIPApi = new TrackBySIPApi() {

        @Override
        public ResponseEntity<Void> trackBySIPPut(UUID xTracking, String X_TENANT_ID, @Valid TrackBySip trackBySIP) {
            throw new UnsupportedOperationException("Unimplemented method 'TrackBySIPPut'");
        }
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = trackBySIPApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
