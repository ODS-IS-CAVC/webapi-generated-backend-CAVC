package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import net.ouranos.domain.digiline.model.AliveMonitoringInfo;

/**
 * Unit tests for the {@link AliveMonitoringInfoApi} class.
 */
public class AliveMonitoringInfoApiTest {

    private AliveMonitoringInfoApi aliveMonitoringInfoApi = new AliveMonitoringInfoApi() {

        @Override
        public ResponseEntity<Object> aliveMonitoringInfoGet(UUID xTracking, Long serviceLocationID, Long roadsideUnitID) {
            throw new UnsupportedOperationException("Unimplemented method 'aliveMonitoringInfoGet'");
        }

        @Override
        public ResponseEntity<Object> aliveMonitoringInfoPut(UUID xTracking, AliveMonitoringInfo aliveMonitoringInfo) {
            throw new UnsupportedOperationException("Unimplemented method 'aliveMonitoringInfoPut'");
        }

    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = aliveMonitoringInfoApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
