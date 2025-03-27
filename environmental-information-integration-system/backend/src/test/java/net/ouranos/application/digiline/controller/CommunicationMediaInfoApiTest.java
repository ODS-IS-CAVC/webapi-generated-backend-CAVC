package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import net.ouranos.domain.digiline.model.CommunicationMediaInfo;

/**
 * Unit tests for the {@link CommunicationMediaInfoApi} class.
 */
public class CommunicationMediaInfoApiTest {

    private CommunicationMediaInfoApi CommunicationMediaInfoApi = new CommunicationMediaInfoApi() {

        @Override
        public ResponseEntity<Object> communicationMediaInfoGet(UUID xTracking, Long serviceLocationID,Long roadsideUnitID) {
            throw new UnsupportedOperationException("Unimplemented method 'CommunicationMediaInfoGet'");
        }

        @Override
        public ResponseEntity<Object> communicationMediaInfoPut(UUID xTracking, CommunicationMediaInfo CommunicationMediaInfo) {
            throw new UnsupportedOperationException("Unimplemented method 'CommunicationMediaInfoPut'");
        }
        
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = CommunicationMediaInfoApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}

