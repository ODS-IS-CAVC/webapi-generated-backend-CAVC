package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import net.ouranos.domain.digiline.model.RoadsideUnitInfo;

/**
 * Unit tests for the {@link RoadsideUnitInfoApi} class.
 */
public class RoadsideUnitInfoApiTest {

    private RoadsideUnitInfoApi RoadsideUnitInfoApi = new RoadsideUnitInfoApi() {

        @Override
        public ResponseEntity<Object> roadsideUnitInfoGet(UUID xTracking, Long serviceLocationID, Long roadsideUnitID) {
            throw new UnsupportedOperationException("Unimplemented method 'RoadsideUnitInfoGet'");
        }

        @Override
        public ResponseEntity<Object> roadsideUnitInfoPut(UUID xTracking, RoadsideUnitInfo roadsideUnitInfo) {
            throw new UnsupportedOperationException("Unimplemented method 'RoadsideUnitInfoPut'");
        }
        
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = RoadsideUnitInfoApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}

