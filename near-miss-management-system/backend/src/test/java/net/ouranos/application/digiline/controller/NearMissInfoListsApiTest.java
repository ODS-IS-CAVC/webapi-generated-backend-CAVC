package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

/**
 * Unit tests for the {@link NearMissInfoListApi} class.
 */
public class NearMissInfoListsApiTest {

    private NearMissInfoListApi nearMissInfoListApi = new NearMissInfoListApi() {

        @Override
        public ResponseEntity<Object> nearmissinfolistGet(UUID xTracking, @Valid UUID id,
                @Size(min = 0, max = 4096) @Valid String name, @Size(min = 0, max = 4096) @Valid String category,
                @Size(min = 0, max = 4096) @Valid String summary, @Valid OffsetDateTime from, @Valid OffsetDateTime to,
                @Valid Double lat0, @Valid Double lon0, @Valid Double lat1, @Valid Double lon1) {
            throw new UnsupportedOperationException("Unimplemented method 'nearmissinfolistGet'");
        }
        
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = nearMissInfoListApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
