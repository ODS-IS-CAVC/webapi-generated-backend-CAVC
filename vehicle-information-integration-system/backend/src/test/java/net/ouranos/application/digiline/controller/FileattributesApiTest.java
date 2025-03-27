package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Unit tests for the {@link FileattributesApi} class.
 */
public class FileattributesApiTest {

    private FileattributesApi fileattributesApi = new FileattributesApi() {

        @Override
        public ResponseEntity<Object> fileattributesGet(UUID xTracking, String queryParam) {
            throw new UnsupportedOperationException("Unimplemented method 'fileattributesGet'");
        }

    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = fileattributesApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
