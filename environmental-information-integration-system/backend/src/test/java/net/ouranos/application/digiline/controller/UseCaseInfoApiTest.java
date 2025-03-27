package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import net.ouranos.domain.digiline.model.UseCaseInfo;

/**
 * Unit tests for the {@link UseCaseInfoApi} class.
 */
public class UseCaseInfoApiTest {

    private UseCaseInfoApi UseCaseInfoApi = new UseCaseInfoApi() {

        @Override
        public ResponseEntity<Object> useCaseInfoGet(UUID xTracking,Long serviceLocationID, Long roadsideUnitID) {
            throw new UnsupportedOperationException("Unimplemented method 'UseCaseInfoGet'");
        }

        @Override
        public ResponseEntity<Object> useCaseInfoPut(UUID xTracking, UseCaseInfo UseCaseInfo) {
            throw new UnsupportedOperationException("Unimplemented method 'UseCaseInfoPut'");
        }
        
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = UseCaseInfoApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}

