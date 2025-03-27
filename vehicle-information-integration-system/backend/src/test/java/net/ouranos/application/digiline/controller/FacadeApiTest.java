package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import net.ouranos.domain.digiline.model.DataModelFacade;

/**
 * Unit tests for the {@link FacadeApi} class.
 */
public class FacadeApiTest {

    private FacadeApi facadeApi = new FacadeApi() {

        @Override
        public ResponseEntity<DataModelFacade> facadeGet(UUID xTracking) {
            throw new UnsupportedOperationException("Unimplemented method 'partsGet'");
        }
        
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = facadeApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
