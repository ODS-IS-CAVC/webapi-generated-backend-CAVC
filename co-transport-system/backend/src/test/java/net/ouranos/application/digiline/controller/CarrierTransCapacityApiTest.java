package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.Valid;
import net.ouranos.domain.digiline.model.CarrierTransCapacity;
import net.ouranos.domain.digiline.model.Vehicle;

/**
 * Unit tests for the {@link CarrierTransCapacityApi} class.
 */
public class CarrierTransCapacityApiTest {
    private CarrierTransCapacityApi dataModelCarrierTransCapacity = new CarrierTransCapacityApi() {

        @Override
        public ResponseEntity<Void> carrierTransCapacityDelete(UUID xTracking,
        String trspInstructionId,
        String serviceNo,
        String serviceStrtDate,
        String cnsgPrtyHeadOffId,
        String cnsgPrtyBrncOffId,
        String trspRqrPrtyHeadOffId,
        String trspRqrPrtyBrncOffId) {
            throw new UnsupportedOperationException("Unimplemented method 'CarrierTransCapacityDelete'");
        }

        @Override
        public ResponseEntity<Object> carrierTransCapacityGet(UUID xTracking,String serviceNo,String serviceName,BigDecimal carMaxLoadCapacity1Meas,String trspOpStrtAreaLineOneTxt,String trspOpEndAreaLineOneTxt,String maxTrspOpDateTrmStrtDate,String minTrspOpDateTrmStrtDate,String maxTrspOpDateTrmEndDate,String minTrspOpDateTrmEndDate,String maxTrspOpPlanDateTrmStrtTime,String minTrspOpPlanDateTrmStrtTime,String maxTrspOpPlanDateTrmEndTime,String minTrspOpPlanDateTrmEndTime){
            throw new UnsupportedOperationException("Unimplemented method 'CarrierTransCapacityGet'");
        } 
        @Override
        public ResponseEntity<Void> carrierTransCapacityPut(UUID xTracking, @Valid CarrierTransCapacity CarrierTransCapacity) {
            throw new UnsupportedOperationException("Unimplemented method 'CarrierTransCapacityPut'");
        }
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = dataModelCarrierTransCapacity.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
