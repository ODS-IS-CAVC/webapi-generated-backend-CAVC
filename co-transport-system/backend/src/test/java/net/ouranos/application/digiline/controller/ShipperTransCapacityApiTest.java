package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.Valid;
import net.ouranos.domain.digiline.model.ShipperTransCapacity;
import java.math.BigDecimal;
/**
 * Unit tests for the {@link TargetInfoApi} class.
 */
public class ShipperTransCapacityApiTest {

    private ShipperTransCapacityApi shipperTransCapacityApi = new ShipperTransCapacityApi() {

        @Override
        public ResponseEntity<Object> shipperTransCapacityGet(UUID xTracking,String serviceNo,String serviceName,BigDecimal carMaxLoadCapacity1Meas,String trspOpStrtAreaLineOneTxt,String trspOpEndAreaLineOneTxt,String maxTrspOpDateTrmStrtDate,String minTrspOpDateTrmStrtDate,String maxTrspOpDateTrmEndDate,String minTrspOpDateTrmEndDate,String maxTrspOpPlanDateTrmStrtTime,String minTrspOpPlanDateTrmStrtTime,String maxTrspOpPlanDateTrmEndTime,String minTrspOpPlanDateTrmEndTime) {
            throw new UnsupportedOperationException("Unimplemented method 'ShipperTransCapacityGet'");
        }

        @Override
        public ResponseEntity<Void> shipperTransCapacityPut(UUID xTracking,  ShipperTransCapacity dataModelShipperTransCapacity) {
            throw new UnsupportedOperationException("Unimplemented method 'ShipperTransCapacityPut'");
        }
        
        @Override
        public ResponseEntity<Void> shipperTransCapacityDelete(UUID xTracking, String trspCliPrtyHeadOffId, String trspCliPrtyBrncOffId, String serviceNo, String serviceStrtDate) {
            throw new UnsupportedOperationException("Unimplemented method 'VehicleDelete'");
        }
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = shipperTransCapacityApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}

